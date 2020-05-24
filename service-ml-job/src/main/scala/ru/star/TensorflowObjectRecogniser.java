package ru.star;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.internal.DnsNameResolverProvider;
import io.grpc.netty.NettyChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static ru.star.InceptionInference.InceptionRequest;
import static ru.star.InceptionInference.InceptionResponse;

/**
 * This class offers image recognition implementation using gRCP communication
 * with TensorFlow Serving server where the Neural Network for image recognition
 * is deployed.
 * <p>
 * Uses the gRPC stub and generated classes for RPC communication.
 */
public class TensorflowObjectRecogniser implements Closeable {

    private static final Logger LOG = LoggerFactory.getLogger(TensorflowObjectRecogniser.class);

    private ManagedChannel channel;
    private InceptionBlockingStub stub;

    public TensorflowObjectRecogniser(String host, int port) {
        LOG.debug("Creating channel host:{}, port={}", host, port);
        try {
            channel = NettyChannelBuilder.forAddress(host, port)
                    .nameResolverFactory(new DnsNameResolverProvider())
                    .usePlaintext(true).build();
            stub = new InceptionBlockingStub(channel);
            // TODO: test channel here with a sample image
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Map.Entry<String, Double>> recognise(InputStream stream) throws Exception {

        List<Map.Entry<String, Double>> objects = new ArrayList<>();
        ByteString jpegData = ByteString.readFrom(stream);
        InceptionRequest request = InceptionRequest.newBuilder().setJpegEncoded(jpegData).build();
        long st = System.currentTimeMillis();
        InceptionResponse response = stub.classify(request);
        long timeTaken = System.currentTimeMillis() - st;
        LOG.debug("Time taken : {}ms", timeTaken);
        Iterator<String> classes = response.getClassesList().iterator();
        Iterator<Float> scores = response.getScoresList().iterator();
        while (classes.hasNext() && scores.hasNext()) {
            String className = classes.next();
            Float score = scores.next();
            Map.Entry<String, Double> object = new AbstractMap.SimpleEntry<>(className, score.doubleValue());
            objects.add(object);
        }
        return objects;
    }

    @Override
    public void close() throws IOException {
        if (channel != null) {
            LOG.debug("Closing the channel ");
            channel.shutdownNow();
        }
    }
}