// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package org.smart.website.commons.lib;

/**
 * Protobuf type {@code RedPacketToUserRequest}
 */
public  final class RedPacketToUserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RedPacketToUserRequest)
    RedPacketToUserRequestOrBuilder {
  public static final int USERID_FIELD_NUMBER = 1;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:RedPacketToUserRequest)
  private static final org.smart.website.commons.lib.RedPacketToUserRequest DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<RedPacketToUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<RedPacketToUserRequest>() {
    public RedPacketToUserRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RedPacketToUserRequest(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new org.smart.website.commons.lib.RedPacketToUserRequest();
  }

  private volatile java.lang.Object userId_;
  private byte memoizedIsInitialized = -1;
  // Use RedPacketToUserRequest.newBuilder() to construct.
  private RedPacketToUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RedPacketToUserRequest() {
    userId_ = "";
  }
  private RedPacketToUserRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
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
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
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
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.smart.website.commons.lib.UserProto.internal_static_RedPacketToUserRequest_descriptor;
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(org.smart.website.commons.lib.RedPacketToUserRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static org.smart.website.commons.lib.RedPacketToUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<RedPacketToUserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.smart.website.commons.lib.UserProto.internal_static_RedPacketToUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.smart.website.commons.lib.RedPacketToUserRequest.class, org.smart.website.commons.lib.RedPacketToUserRequest.Builder.class);
  }

  /**
   * <code>string userId = 1;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }

  /**
   * <code>string userId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.smart.website.commons.lib.RedPacketToUserRequest)) {
      return super.equals(obj);
    }
    org.smart.website.commons.lib.RedPacketToUserRequest other = (org.smart.website.commons.lib.RedPacketToUserRequest) obj;

    boolean result = true;
    result = result && getUserId()
        .equals(other.getUserId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public Builder newBuilderForType() { return newBuilder(); }

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

  @java.lang.Override
  public com.google.protobuf.Parser<RedPacketToUserRequest> getParserForType() {
    return PARSER;
  }

  public org.smart.website.commons.lib.RedPacketToUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code RedPacketToUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RedPacketToUserRequest)
      org.smart.website.commons.lib.RedPacketToUserRequestOrBuilder {
    private java.lang.Object userId_ = "";

    // Construct using org.smart.website.commons.lib.RedPacketToUserRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.smart.website.commons.lib.UserProto.internal_static_RedPacketToUserRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.smart.website.commons.lib.UserProto.internal_static_RedPacketToUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.smart.website.commons.lib.RedPacketToUserRequest.class, org.smart.website.commons.lib.RedPacketToUserRequest.Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    public Builder clear() {
      super.clear();
      userId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.smart.website.commons.lib.UserProto.internal_static_RedPacketToUserRequest_descriptor;
    }

    public org.smart.website.commons.lib.RedPacketToUserRequest getDefaultInstanceForType() {
      return org.smart.website.commons.lib.RedPacketToUserRequest.getDefaultInstance();
    }

    public org.smart.website.commons.lib.RedPacketToUserRequest build() {
      org.smart.website.commons.lib.RedPacketToUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.smart.website.commons.lib.RedPacketToUserRequest buildPartial() {
      org.smart.website.commons.lib.RedPacketToUserRequest result = new org.smart.website.commons.lib.RedPacketToUserRequest(this);
      result.userId_ = userId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return super.clone();
    }

    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }

    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }

    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.smart.website.commons.lib.RedPacketToUserRequest) {
        return mergeFrom((org.smart.website.commons.lib.RedPacketToUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.smart.website.commons.lib.RedPacketToUserRequest other) {
      if (other == org.smart.website.commons.lib.RedPacketToUserRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.smart.website.commons.lib.RedPacketToUserRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.smart.website.commons.lib.RedPacketToUserRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    /**
     * <code>string userId = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string userId = 1;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      userId_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string userId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string userId = 1;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      userId_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string userId = 1;</code>
     */
    public Builder clearUserId() {

      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }

    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:RedPacketToUserRequest)
  }

}

