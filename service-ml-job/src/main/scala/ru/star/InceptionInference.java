package ru.star;

import com.google.protobuf.*;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class InceptionInference {
    private InceptionInference() {
    }

    public static void registerAllExtensions(ExtensionRegistry registry) {
    }

    public interface InceptionRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:tensorflow.serving.InceptionRequest)
            MessageOrBuilder {

        /**
         * <pre>
         * JPEG encoded stream of the image to be classified.
         * </pre>
         * <p>
         * <code>optional bytes jpeg_encoded = 1;</code>
         */
        ByteString getJpegEncoded();
    }

    /**
     * Protobuf type {@code tensorflow.serving.InceptionRequest}
     */
    public static final class InceptionRequest extends GeneratedMessage implements
            // @@protoc_insertion_point(message_implements:tensorflow.serving.InceptionRequest)
            InceptionRequestOrBuilder {
        // Use InceptionRequest.newBuilder() to construct.
        private InceptionRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
        }

        private InceptionRequest() {
            jpegEncoded_ = ByteString.EMPTY;
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private InceptionRequest(CodedInputStream input,
                                 ExtensionRegistryLite extensionRegistry)
                throws InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {

                            jpegEncoded_ = input.readBytes();
                            break;
                        }
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final Descriptor getDescriptor() {
            return InceptionInference.internal_static_tensorflow_serving_InceptionRequest_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return InceptionInference.internal_static_tensorflow_serving_InceptionRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(InceptionRequest.class,
                            Builder.class);
        }

        public static final int JPEG_ENCODED_FIELD_NUMBER = 1;
        private ByteString jpegEncoded_;

        /**
         * <pre>
         * JPEG encoded stream of the image to be classified.
         * </pre>
         * <p>
         * <code>optional bytes jpeg_encoded = 1;</code>
         */
        public ByteString getJpegEncoded() {
            return jpegEncoded_;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if (!jpegEncoded_.isEmpty()) {
                output.writeBytes(1, jpegEncoded_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1)
                return size;

            size = 0;
            if (!jpegEncoded_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(1, jpegEncoded_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        public static InceptionRequest parseFrom(ByteString data)
                throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static InceptionRequest parseFrom(ByteString data,
                                                 ExtensionRegistryLite extensionRegistry)
                throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static InceptionRequest parseFrom(byte[] data)
                throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static InceptionRequest parseFrom(byte[] data,
                                                 ExtensionRegistryLite extensionRegistry)
                throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static InceptionRequest parseFrom(InputStream input)
                throws IOException {
            return GeneratedMessage.parseWithIOException(PARSER, input);
        }

        public static InceptionRequest parseFrom(InputStream input,
                                                 ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessage
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static InceptionRequest parseDelimitedFrom(InputStream input)
                throws IOException {
            return GeneratedMessage.parseDelimitedWithIOException(PARSER, input);
        }

        public static InceptionRequest parseDelimitedFrom(InputStream input,
                                                          ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessage
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static InceptionRequest parseFrom(CodedInputStream input)
                throws IOException {
            return GeneratedMessage.parseWithIOException(PARSER, input);
        }

        public static InceptionRequest parseFrom(CodedInputStream input,
                                                 ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessage
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(InceptionRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ?
                    new Builder() :
                    new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code tensorflow.serving.InceptionRequest}
         */
        public static final class Builder extends GeneratedMessage.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:tensorflow.serving.InceptionRequest)
                InceptionRequestOrBuilder {
            public static final Descriptor getDescriptor() {
                return InceptionInference.internal_static_tensorflow_serving_InceptionRequest_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return InceptionInference.internal_static_tensorflow_serving_InceptionRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(InceptionRequest.class,
                                Builder.class);
            }

            // Construct using tensorflow.serving.InceptionInference.InceptionRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                jpegEncoded_ = ByteString.EMPTY;

                return this;
            }

            public Descriptor getDescriptorForType() {
                return InceptionInference.internal_static_tensorflow_serving_InceptionRequest_descriptor;
            }

            public InceptionRequest getDefaultInstanceForType() {
                return getDefaultInstance();
            }

            public InceptionRequest build() {
                InceptionRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public InceptionRequest buildPartial() {
                InceptionRequest result = new InceptionRequest(this);
                result.jpegEncoded_ = jpegEncoded_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof InceptionRequest) {
                    return mergeFrom((InceptionRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(InceptionRequest other) {
                if (other == getDefaultInstance())
                    return this;
                if (other.getJpegEncoded() != ByteString.EMPTY) {
                    setJpegEncoded(other.getJpegEncoded());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input,
                                     ExtensionRegistryLite extensionRegistry) throws IOException {
                InceptionRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (InceptionRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private ByteString jpegEncoded_ = ByteString.EMPTY;

            /**
             * <pre>
             * JPEG encoded stream of the image to be classified.
             * </pre>
             * <p>
             * <code>optional bytes jpeg_encoded = 1;</code>
             */
            public ByteString getJpegEncoded() {
                return jpegEncoded_;
            }

            /**
             * <pre>
             * JPEG encoded stream of the image to be classified.
             * </pre>
             * <p>
             * <code>optional bytes jpeg_encoded = 1;</code>
             */
            public Builder setJpegEncoded(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                jpegEncoded_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * JPEG encoded stream of the image to be classified.
             * </pre>
             * <p>
             * <code>optional bytes jpeg_encoded = 1;</code>
             */
            public Builder clearJpegEncoded() {

                jpegEncoded_ = getDefaultInstance().getJpegEncoded();
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(
                    final UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final UnknownFieldSet unknownFields) {
                return this;
            }

            // @@protoc_insertion_point(builder_scope:tensorflow.serving.InceptionRequest)
        }

        // @@protoc_insertion_point(class_scope:tensorflow.serving.InceptionRequest)
        private static final InceptionRequest DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new InceptionRequest();
        }

        public static InceptionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final Parser<InceptionRequest> PARSER = new AbstractParser<InceptionRequest>() {
            public InceptionRequest parsePartialFrom(CodedInputStream input,
                                                     ExtensionRegistryLite extensionRegistry)
                    throws InvalidProtocolBufferException {
                return new InceptionRequest(input, extensionRegistry);
            }
        };

        public static Parser<InceptionRequest> parser() {
            return PARSER;
        }

        @Override
        public Parser<InceptionRequest> getParserForType() {
            return PARSER;
        }

        public InceptionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface InceptionResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:tensorflow.serving.InceptionResponse)
            MessageOrBuilder {

        /**
         * <pre>
         * Human readable descriptions of the classes, in scores descending order.
         * </pre>
         * <p>
         * <code>repeated string classes = 3;</code>
         */
        ProtocolStringList getClassesList();

        /**
         * <pre>
         * Human readable descriptions of the classes, in scores descending order.
         * </pre>
         * <p>
         * <code>repeated string classes = 3;</code>
         */
        int getClassesCount();

        /**
         * <pre>
         * Human readable descriptions of the classes, in scores descending order.
         * </pre>
         * <p>
         * <code>repeated string classes = 3;</code>
         */
        String getClasses(int index);

        /**
         * <pre>
         * Human readable descriptions of the classes, in scores descending order.
         * </pre>
         * <p>
         * <code>repeated string classes = 3;</code>
         */
        ByteString getClassesBytes(int index);

        /**
         * <pre>
         * Scores of top matches, in same order as classes.
         * </pre>
         * <p>
         * <code>repeated float scores = 2;</code>
         */
        List<Float> getScoresList();

        /**
         * <pre>
         * Scores of top matches, in same order as classes.
         * </pre>
         * <p>
         * <code>repeated float scores = 2;</code>
         */
        int getScoresCount();

        /**
         * <pre>
         * Scores of top matches, in same order as classes.
         * </pre>
         * <p>
         * <code>repeated float scores = 2;</code>
         */
        float getScores(int index);
    }

    /**
     * Protobuf type {@code tensorflow.serving.InceptionResponse}
     */
    public static final class InceptionResponse extends GeneratedMessage
            implements
            // @@protoc_insertion_point(message_implements:tensorflow.serving.InceptionResponse)
            InceptionResponseOrBuilder {
        // Use InceptionResponse.newBuilder() to construct.
        private InceptionResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
        }

        private InceptionResponse() {
            classes_ = LazyStringArrayList.EMPTY;
            scores_ = Collections.emptyList();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private InceptionResponse(CodedInputStream input,
                                  ExtensionRegistryLite extensionRegistry)
                throws InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 21: {
                            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                                scores_ = new ArrayList<Float>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            scores_.add(input.readFloat());
                            break;
                        }
                        case 18: {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)
                                    && input.getBytesUntilLimit() > 0) {
                                scores_ = new ArrayList<Float>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                scores_.add(input.readFloat());
                            }
                            input.popLimit(limit);
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                classes_ = new LazyStringArrayList();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            classes_.add(s);
                            break;
                        }
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                    scores_ = Collections.unmodifiableList(scores_);
                }
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    classes_ = classes_.getUnmodifiableView();
                }
                makeExtensionsImmutable();
            }
        }

        public static final Descriptor getDescriptor() {
            return InceptionInference.internal_static_tensorflow_serving_InceptionResponse_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return InceptionInference.internal_static_tensorflow_serving_InceptionResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(InceptionResponse.class,
                            Builder.class);
        }

        public static final int CLASSES_FIELD_NUMBER = 3;
        private LazyStringList classes_;

        /**
         * <pre>
         * Human readable descriptions of the classes, in scores descending order.
         * </pre>
         * <p>
         * <code>repeated string classes = 3;</code>
         */
        public ProtocolStringList getClassesList() {
            return classes_;
        }

        /**
         * <pre>
         * Human readable descriptions of the classes, in scores descending order.
         * </pre>
         * <p>
         * <code>repeated string classes = 3;</code>
         */
        public int getClassesCount() {
            return classes_.size();
        }

        /**
         * <pre>
         * Human readable descriptions of the classes, in scores descending order.
         * </pre>
         * <p>
         * <code>repeated string classes = 3;</code>
         */
        public String getClasses(int index) {
            return classes_.get(index);
        }

        /**
         * <pre>
         * Human readable descriptions of the classes, in scores descending order.
         * </pre>
         * <p>
         * <code>repeated string classes = 3;</code>
         */
        public ByteString getClassesBytes(int index) {
            return classes_.getByteString(index);
        }

        public static final int SCORES_FIELD_NUMBER = 2;
        private List<Float> scores_;

        /**
         * <pre>
         * Scores of top matches, in same order as classes.
         * </pre>
         * <p>
         * <code>repeated float scores = 2;</code>
         */
        public List<Float> getScoresList() {
            return scores_;
        }

        /**
         * <pre>
         * Scores of top matches, in same order as classes.
         * </pre>
         * <p>
         * <code>repeated float scores = 2;</code>
         */
        public int getScoresCount() {
            return scores_.size();
        }

        /**
         * <pre>
         * Scores of top matches, in same order as classes.
         * </pre>
         * <p>
         * <code>repeated float scores = 2;</code>
         */
        public float getScores(int index) {
            return scores_.get(index);
        }

        private int scoresMemoizedSerializedSize = -1;

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if (getScoresList().size() > 0) {
                output.writeRawVarint32(18);
                output.writeRawVarint32(scoresMemoizedSerializedSize);
            }
            for (int i = 0; i < scores_.size(); i++) {
                output.writeFloatNoTag(scores_.get(i));
            }
            for (int i = 0; i < classes_.size(); i++) {
                GeneratedMessage.writeString(output, 3, classes_.getRaw(i));
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1)
                return size;

            size = 0;
            {
                int dataSize = 0;
                dataSize = 4 * getScoresList().size();
                size += dataSize;
                if (!getScoresList().isEmpty()) {
                    size += 1;
                    size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                scoresMemoizedSerializedSize = dataSize;
            }
            {
                int dataSize = 0;
                for (int i = 0; i < classes_.size(); i++) {
                    dataSize += computeStringSizeNoTag(classes_.getRaw(i));
                }
                size += dataSize;
                size += 1 * getClassesList().size();
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        public static InceptionResponse parseFrom(ByteString data)
                throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static InceptionResponse parseFrom(ByteString data,
                                                  ExtensionRegistryLite extensionRegistry)
                throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static InceptionResponse parseFrom(byte[] data)
                throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static InceptionResponse parseFrom(byte[] data,
                                                  ExtensionRegistryLite extensionRegistry)
                throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static InceptionResponse parseFrom(InputStream input)
                throws IOException {
            return GeneratedMessage.parseWithIOException(PARSER, input);
        }

        public static InceptionResponse parseFrom(InputStream input,
                                                  ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessage
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static InceptionResponse parseDelimitedFrom(InputStream input)
                throws IOException {
            return GeneratedMessage.parseDelimitedWithIOException(PARSER, input);
        }

        public static InceptionResponse parseDelimitedFrom(InputStream input,
                                                           ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessage
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static InceptionResponse parseFrom(CodedInputStream input)
                throws IOException {
            return GeneratedMessage.parseWithIOException(PARSER, input);
        }

        public static InceptionResponse parseFrom(CodedInputStream input,
                                                  ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessage
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(InceptionResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ?
                    new Builder() :
                    new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code tensorflow.serving.InceptionResponse}
         */
        public static final class Builder extends GeneratedMessage.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:tensorflow.serving.InceptionResponse)
                InceptionResponseOrBuilder {
            public static final Descriptor getDescriptor() {
                return InceptionInference.internal_static_tensorflow_serving_InceptionResponse_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return InceptionInference.internal_static_tensorflow_serving_InceptionResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(InceptionResponse.class,
                                Builder.class);
            }

            // Construct using tensorflow.serving.InceptionInference.InceptionResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                classes_ = LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                scores_ = Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Descriptor getDescriptorForType() {
                return InceptionInference.internal_static_tensorflow_serving_InceptionResponse_descriptor;
            }

            public InceptionResponse getDefaultInstanceForType() {
                return getDefaultInstance();
            }

            public InceptionResponse build() {
                InceptionResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public InceptionResponse buildPartial() {
                InceptionResponse result = new InceptionResponse(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    classes_ = classes_.getUnmodifiableView();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.classes_ = classes_;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    scores_ = Collections.unmodifiableList(scores_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.scores_ = scores_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof InceptionResponse) {
                    return mergeFrom((InceptionResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(InceptionResponse other) {
                if (other == getDefaultInstance())
                    return this;
                if (!other.classes_.isEmpty()) {
                    if (classes_.isEmpty()) {
                        classes_ = other.classes_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureClassesIsMutable();
                        classes_.addAll(other.classes_);
                    }
                    onChanged();
                }
                if (!other.scores_.isEmpty()) {
                    if (scores_.isEmpty()) {
                        scores_ = other.scores_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensureScoresIsMutable();
                        scores_.addAll(other.scores_);
                    }
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input,
                                     ExtensionRegistryLite extensionRegistry) throws IOException {
                InceptionResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (InceptionResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private LazyStringList classes_ = LazyStringArrayList.EMPTY;

            private void ensureClassesIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    classes_ = new LazyStringArrayList(classes_);
                    bitField0_ |= 0x00000001;
                }
            }

            /**
             * <pre>
             * Human readable descriptions of the classes, in scores descending order.
             * </pre>
             * <p>
             * <code>repeated string classes = 3;</code>
             */
            public ProtocolStringList getClassesList() {
                return classes_.getUnmodifiableView();
            }

            /**
             * <pre>
             * Human readable descriptions of the classes, in scores descending order.
             * </pre>
             * <p>
             * <code>repeated string classes = 3;</code>
             */
            public int getClassesCount() {
                return classes_.size();
            }

            /**
             * <pre>
             * Human readable descriptions of the classes, in scores descending order.
             * </pre>
             * <p>
             * <code>repeated string classes = 3;</code>
             */
            public String getClasses(int index) {
                return classes_.get(index);
            }

            /**
             * <pre>
             * Human readable descriptions of the classes, in scores descending order.
             * </pre>
             * <p>
             * <code>repeated string classes = 3;</code>
             */
            public ByteString getClassesBytes(int index) {
                return classes_.getByteString(index);
            }

            /**
             * <pre>
             * Human readable descriptions of the classes, in scores descending order.
             * </pre>
             * <p>
             * <code>repeated string classes = 3;</code>
             */
            public Builder setClasses(int index, String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureClassesIsMutable();
                classes_.set(index, value);
                onChanged();
                return this;
            }

            /**
             * <pre>
             * Human readable descriptions of the classes, in scores descending order.
             * </pre>
             * <p>
             * <code>repeated string classes = 3;</code>
             */
            public Builder addClasses(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureClassesIsMutable();
                classes_.add(value);
                onChanged();
                return this;
            }

            /**
             * <pre>
             * Human readable descriptions of the classes, in scores descending order.
             * </pre>
             * <p>
             * <code>repeated string classes = 3;</code>
             */
            public Builder addAllClasses(Iterable<String> values) {
                ensureClassesIsMutable();
                AbstractMessageLite.Builder.addAll(values, classes_);
                onChanged();
                return this;
            }

            /**
             * <pre>
             * Human readable descriptions of the classes, in scores descending order.
             * </pre>
             * <p>
             * <code>repeated string classes = 3;</code>
             */
            public Builder clearClasses() {
                classes_ = LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            /**
             * <pre>
             * Human readable descriptions of the classes, in scores descending order.
             * </pre>
             * <p>
             * <code>repeated string classes = 3;</code>
             */
            public Builder addClassesBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);
                ensureClassesIsMutable();
                classes_.add(value);
                onChanged();
                return this;
            }

            private List<Float> scores_ = Collections.emptyList();

            private void ensureScoresIsMutable() {
                if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                    scores_ = new ArrayList<Float>(scores_);
                    bitField0_ |= 0x00000002;
                }
            }

            /**
             * <pre>
             * Scores of top matches, in same order as classes.
             * </pre>
             * <p>
             * <code>repeated float scores = 2;</code>
             */
            public List<Float> getScoresList() {
                return Collections.unmodifiableList(scores_);
            }

            /**
             * <pre>
             * Scores of top matches, in same order as classes.
             * </pre>
             * <p>
             * <code>repeated float scores = 2;</code>
             */
            public int getScoresCount() {
                return scores_.size();
            }

            /**
             * <pre>
             * Scores of top matches, in same order as classes.
             * </pre>
             * <p>
             * <code>repeated float scores = 2;</code>
             */
            public float getScores(int index) {
                return scores_.get(index);
            }

            /**
             * <pre>
             * Scores of top matches, in same order as classes.
             * </pre>
             * <p>
             * <code>repeated float scores = 2;</code>
             */
            public Builder setScores(int index, float value) {
                ensureScoresIsMutable();
                scores_.set(index, value);
                onChanged();
                return this;
            }

            /**
             * <pre>
             * Scores of top matches, in same order as classes.
             * </pre>
             * <p>
             * <code>repeated float scores = 2;</code>
             */
            public Builder addScores(float value) {
                ensureScoresIsMutable();
                scores_.add(value);
                onChanged();
                return this;
            }

            /**
             * <pre>
             * Scores of top matches, in same order as classes.
             * </pre>
             * <p>
             * <code>repeated float scores = 2;</code>
             */
            public Builder addAllScores(Iterable<? extends Float> values) {
                ensureScoresIsMutable();
                AbstractMessageLite.Builder.addAll(values, scores_);
                onChanged();
                return this;
            }

            /**
             * <pre>
             * Scores of top matches, in same order as classes.
             * </pre>
             * <p>
             * <code>repeated float scores = 2;</code>
             */
            public Builder clearScores() {
                scores_ = Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(
                    final UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final UnknownFieldSet unknownFields) {
                return this;
            }

            // @@protoc_insertion_point(builder_scope:tensorflow.serving.InceptionResponse)
        }

        // @@protoc_insertion_point(class_scope:tensorflow.serving.InceptionResponse)
        private static final InceptionResponse DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new InceptionResponse();
        }

        public static InceptionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final Parser<InceptionResponse> PARSER = new AbstractParser<InceptionResponse>() {
            public InceptionResponse parsePartialFrom(CodedInputStream input,
                                                      ExtensionRegistryLite extensionRegistry)
                    throws InvalidProtocolBufferException {
                return new InceptionResponse(input, extensionRegistry);
            }
        };

        public static Parser<InceptionResponse> parser() {
            return PARSER;
        }

        @Override
        public Parser<InceptionResponse> getParserForType() {
            return PARSER;
        }

        public InceptionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final Descriptor internal_static_tensorflow_serving_InceptionRequest_descriptor;
    private static final FieldAccessorTable internal_static_tensorflow_serving_InceptionRequest_fieldAccessorTable;
    private static final Descriptor internal_static_tensorflow_serving_InceptionResponse_descriptor;
    private static final FieldAccessorTable internal_static_tensorflow_serving_InceptionResponse_fieldAccessorTable;

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static FileDescriptor descriptor;

    static {
        String[] descriptorData = {
                "\n\031inception_inference.proto\022\022tensorflow." +
                        "serving\"(\n\020InceptionRequest\022\024\n\014jpeg_enco" +
                        "ded\030\001 \001(\014\"4\n\021InceptionResponse\022\017\n\007classe"
                        +
                        "s\030\003 \003(\t\022\016\n\006scores\030\002 \003(\0022k\n\020InceptionServ"
                        +
                        "ice\022W\n\010Classify\022$.tensorflow.serving.Inc" +
                        "eptionRequest\032%.tensorflow.serving.Incep" +
                        "tionResponseb\006proto3"};
        InternalDescriptorAssigner assigner = new InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(FileDescriptor root) {
                descriptor = root;
                return null;
            }
        };
        FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData, new FileDescriptor[]{},
                        assigner);
        internal_static_tensorflow_serving_InceptionRequest_descriptor = getDescriptor()
                .getMessageTypes().get(0);
        internal_static_tensorflow_serving_InceptionRequest_fieldAccessorTable = new FieldAccessorTable(
                internal_static_tensorflow_serving_InceptionRequest_descriptor,
                new String[]{"JpegEncoded",});
        internal_static_tensorflow_serving_InceptionResponse_descriptor = getDescriptor()
                .getMessageTypes().get(1);
        internal_static_tensorflow_serving_InceptionResponse_fieldAccessorTable = new FieldAccessorTable(
                internal_static_tensorflow_serving_InceptionResponse_descriptor,
                new String[]{"Classes", "Scores",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
