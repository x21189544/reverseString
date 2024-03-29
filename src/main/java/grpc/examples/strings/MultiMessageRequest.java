// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: strings.proto

package grpc.examples.strings;

/**
 * Protobuf type {@code strings.MultiMessageRequest}
 */
public  final class MultiMessageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:strings.MultiMessageRequest)
    MultiMessageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiMessageRequest.newBuilder() to construct.
  private MultiMessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiMessageRequest() {
    multirequest_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiMessageRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              multirequest_ = new java.util.ArrayList<grpc.examples.strings.StringRequest>();
              mutable_bitField0_ |= 0x00000001;
            }
            multirequest_.add(
                input.readMessage(grpc.examples.strings.StringRequest.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        multirequest_ = java.util.Collections.unmodifiableList(multirequest_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.examples.strings.StringsServiceImpl.internal_static_strings_MultiMessageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.examples.strings.StringsServiceImpl.internal_static_strings_MultiMessageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.examples.strings.MultiMessageRequest.class, grpc.examples.strings.MultiMessageRequest.Builder.class);
  }

  public static final int MULTIREQUEST_FIELD_NUMBER = 1;
  private java.util.List<grpc.examples.strings.StringRequest> multirequest_;
  /**
   * <code>repeated .strings.StringRequest multirequest = 1;</code>
   */
  public java.util.List<grpc.examples.strings.StringRequest> getMultirequestList() {
    return multirequest_;
  }
  /**
   * <code>repeated .strings.StringRequest multirequest = 1;</code>
   */
  public java.util.List<? extends grpc.examples.strings.StringRequestOrBuilder> 
      getMultirequestOrBuilderList() {
    return multirequest_;
  }
  /**
   * <code>repeated .strings.StringRequest multirequest = 1;</code>
   */
  public int getMultirequestCount() {
    return multirequest_.size();
  }
  /**
   * <code>repeated .strings.StringRequest multirequest = 1;</code>
   */
  public grpc.examples.strings.StringRequest getMultirequest(int index) {
    return multirequest_.get(index);
  }
  /**
   * <code>repeated .strings.StringRequest multirequest = 1;</code>
   */
  public grpc.examples.strings.StringRequestOrBuilder getMultirequestOrBuilder(
      int index) {
    return multirequest_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < multirequest_.size(); i++) {
      output.writeMessage(1, multirequest_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < multirequest_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, multirequest_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.examples.strings.MultiMessageRequest)) {
      return super.equals(obj);
    }
    grpc.examples.strings.MultiMessageRequest other = (grpc.examples.strings.MultiMessageRequest) obj;

    boolean result = true;
    result = result && getMultirequestList()
        .equals(other.getMultirequestList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMultirequestCount() > 0) {
      hash = (37 * hash) + MULTIREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getMultirequestList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.examples.strings.MultiMessageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.examples.strings.MultiMessageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.examples.strings.MultiMessageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.examples.strings.MultiMessageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.examples.strings.MultiMessageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.examples.strings.MultiMessageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.examples.strings.MultiMessageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.examples.strings.MultiMessageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.examples.strings.MultiMessageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.examples.strings.MultiMessageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.examples.strings.MultiMessageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.examples.strings.MultiMessageRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.examples.strings.MultiMessageRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code strings.MultiMessageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:strings.MultiMessageRequest)
      grpc.examples.strings.MultiMessageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.examples.strings.StringsServiceImpl.internal_static_strings_MultiMessageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.examples.strings.StringsServiceImpl.internal_static_strings_MultiMessageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.examples.strings.MultiMessageRequest.class, grpc.examples.strings.MultiMessageRequest.Builder.class);
    }

    // Construct using grpc.examples.strings.MultiMessageRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getMultirequestFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (multirequestBuilder_ == null) {
        multirequest_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        multirequestBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.examples.strings.StringsServiceImpl.internal_static_strings_MultiMessageRequest_descriptor;
    }

    @java.lang.Override
    public grpc.examples.strings.MultiMessageRequest getDefaultInstanceForType() {
      return grpc.examples.strings.MultiMessageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.examples.strings.MultiMessageRequest build() {
      grpc.examples.strings.MultiMessageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.examples.strings.MultiMessageRequest buildPartial() {
      grpc.examples.strings.MultiMessageRequest result = new grpc.examples.strings.MultiMessageRequest(this);
      int from_bitField0_ = bitField0_;
      if (multirequestBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          multirequest_ = java.util.Collections.unmodifiableList(multirequest_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.multirequest_ = multirequest_;
      } else {
        result.multirequest_ = multirequestBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.examples.strings.MultiMessageRequest) {
        return mergeFrom((grpc.examples.strings.MultiMessageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.examples.strings.MultiMessageRequest other) {
      if (other == grpc.examples.strings.MultiMessageRequest.getDefaultInstance()) return this;
      if (multirequestBuilder_ == null) {
        if (!other.multirequest_.isEmpty()) {
          if (multirequest_.isEmpty()) {
            multirequest_ = other.multirequest_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMultirequestIsMutable();
            multirequest_.addAll(other.multirequest_);
          }
          onChanged();
        }
      } else {
        if (!other.multirequest_.isEmpty()) {
          if (multirequestBuilder_.isEmpty()) {
            multirequestBuilder_.dispose();
            multirequestBuilder_ = null;
            multirequest_ = other.multirequest_;
            bitField0_ = (bitField0_ & ~0x00000001);
            multirequestBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMultirequestFieldBuilder() : null;
          } else {
            multirequestBuilder_.addAllMessages(other.multirequest_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.examples.strings.MultiMessageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.examples.strings.MultiMessageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<grpc.examples.strings.StringRequest> multirequest_ =
      java.util.Collections.emptyList();
    private void ensureMultirequestIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        multirequest_ = new java.util.ArrayList<grpc.examples.strings.StringRequest>(multirequest_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.examples.strings.StringRequest, grpc.examples.strings.StringRequest.Builder, grpc.examples.strings.StringRequestOrBuilder> multirequestBuilder_;

    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public java.util.List<grpc.examples.strings.StringRequest> getMultirequestList() {
      if (multirequestBuilder_ == null) {
        return java.util.Collections.unmodifiableList(multirequest_);
      } else {
        return multirequestBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public int getMultirequestCount() {
      if (multirequestBuilder_ == null) {
        return multirequest_.size();
      } else {
        return multirequestBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public grpc.examples.strings.StringRequest getMultirequest(int index) {
      if (multirequestBuilder_ == null) {
        return multirequest_.get(index);
      } else {
        return multirequestBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public Builder setMultirequest(
        int index, grpc.examples.strings.StringRequest value) {
      if (multirequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMultirequestIsMutable();
        multirequest_.set(index, value);
        onChanged();
      } else {
        multirequestBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public Builder setMultirequest(
        int index, grpc.examples.strings.StringRequest.Builder builderForValue) {
      if (multirequestBuilder_ == null) {
        ensureMultirequestIsMutable();
        multirequest_.set(index, builderForValue.build());
        onChanged();
      } else {
        multirequestBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public Builder addMultirequest(grpc.examples.strings.StringRequest value) {
      if (multirequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMultirequestIsMutable();
        multirequest_.add(value);
        onChanged();
      } else {
        multirequestBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public Builder addMultirequest(
        int index, grpc.examples.strings.StringRequest value) {
      if (multirequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMultirequestIsMutable();
        multirequest_.add(index, value);
        onChanged();
      } else {
        multirequestBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public Builder addMultirequest(
        grpc.examples.strings.StringRequest.Builder builderForValue) {
      if (multirequestBuilder_ == null) {
        ensureMultirequestIsMutable();
        multirequest_.add(builderForValue.build());
        onChanged();
      } else {
        multirequestBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public Builder addMultirequest(
        int index, grpc.examples.strings.StringRequest.Builder builderForValue) {
      if (multirequestBuilder_ == null) {
        ensureMultirequestIsMutable();
        multirequest_.add(index, builderForValue.build());
        onChanged();
      } else {
        multirequestBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public Builder addAllMultirequest(
        java.lang.Iterable<? extends grpc.examples.strings.StringRequest> values) {
      if (multirequestBuilder_ == null) {
        ensureMultirequestIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, multirequest_);
        onChanged();
      } else {
        multirequestBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public Builder clearMultirequest() {
      if (multirequestBuilder_ == null) {
        multirequest_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        multirequestBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public Builder removeMultirequest(int index) {
      if (multirequestBuilder_ == null) {
        ensureMultirequestIsMutable();
        multirequest_.remove(index);
        onChanged();
      } else {
        multirequestBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public grpc.examples.strings.StringRequest.Builder getMultirequestBuilder(
        int index) {
      return getMultirequestFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public grpc.examples.strings.StringRequestOrBuilder getMultirequestOrBuilder(
        int index) {
      if (multirequestBuilder_ == null) {
        return multirequest_.get(index);  } else {
        return multirequestBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public java.util.List<? extends grpc.examples.strings.StringRequestOrBuilder> 
         getMultirequestOrBuilderList() {
      if (multirequestBuilder_ != null) {
        return multirequestBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(multirequest_);
      }
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public grpc.examples.strings.StringRequest.Builder addMultirequestBuilder() {
      return getMultirequestFieldBuilder().addBuilder(
          grpc.examples.strings.StringRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public grpc.examples.strings.StringRequest.Builder addMultirequestBuilder(
        int index) {
      return getMultirequestFieldBuilder().addBuilder(
          index, grpc.examples.strings.StringRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .strings.StringRequest multirequest = 1;</code>
     */
    public java.util.List<grpc.examples.strings.StringRequest.Builder> 
         getMultirequestBuilderList() {
      return getMultirequestFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.examples.strings.StringRequest, grpc.examples.strings.StringRequest.Builder, grpc.examples.strings.StringRequestOrBuilder> 
        getMultirequestFieldBuilder() {
      if (multirequestBuilder_ == null) {
        multirequestBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            grpc.examples.strings.StringRequest, grpc.examples.strings.StringRequest.Builder, grpc.examples.strings.StringRequestOrBuilder>(
                multirequest_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        multirequest_ = null;
      }
      return multirequestBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:strings.MultiMessageRequest)
  }

  // @@protoc_insertion_point(class_scope:strings.MultiMessageRequest)
  private static final grpc.examples.strings.MultiMessageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.examples.strings.MultiMessageRequest();
  }

  public static grpc.examples.strings.MultiMessageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiMessageRequest>
      PARSER = new com.google.protobuf.AbstractParser<MultiMessageRequest>() {
    @java.lang.Override
    public MultiMessageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiMessageRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiMessageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiMessageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.examples.strings.MultiMessageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

