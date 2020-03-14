// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Promotion.proto

package org.smart.website.commons.lib;

/**
 * Protobuf type {@code OrderGetPromotionReply}
 */
public  final class OrderGetPromotionReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OrderGetPromotionReply)
    OrderGetPromotionReplyOrBuilder {
  // Use OrderGetPromotionReply.newBuilder() to construct.
  private OrderGetPromotionReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderGetPromotionReply() {
    promotionId_ = "";
    promotionAmount_ = "";
    promotionName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private OrderGetPromotionReply(
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

            promotionId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            promotionAmount_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            promotionName_ = s;
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
    return org.smart.website.commons.lib.PromotionProto.internal_static_OrderGetPromotionReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.smart.website.commons.lib.PromotionProto.internal_static_OrderGetPromotionReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    org.smart.website.commons.lib.OrderGetPromotionReply.class, org.smart.website.commons.lib.OrderGetPromotionReply.Builder.class);
  }

  public static final int PROMOTIONID_FIELD_NUMBER = 1;
  private volatile java.lang.Object promotionId_;
  /**
   * <code>string PromotionId = 1;</code>
   */
  public java.lang.String getPromotionId() {
    java.lang.Object ref = promotionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      promotionId_ = s;
      return s;
    }
  }
  /**
   * <code>string PromotionId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPromotionIdBytes() {
    java.lang.Object ref = promotionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      promotionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROMOTIONAMOUNT_FIELD_NUMBER = 2;
  private volatile java.lang.Object promotionAmount_;
  /**
   * <code>string PromotionAmount = 2;</code>
   */
  public java.lang.String getPromotionAmount() {
    java.lang.Object ref = promotionAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      promotionAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string PromotionAmount = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPromotionAmountBytes() {
    java.lang.Object ref = promotionAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      promotionAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROMOTIONNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object promotionName_;
  /**
   * <code>string PromotionName = 3;</code>
   */
  public java.lang.String getPromotionName() {
    java.lang.Object ref = promotionName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      promotionName_ = s;
      return s;
    }
  }
  /**
   * <code>string PromotionName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPromotionNameBytes() {
    java.lang.Object ref = promotionName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      promotionName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPromotionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, promotionId_);
    }
    if (!getPromotionAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, promotionAmount_);
    }
    if (!getPromotionNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, promotionName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPromotionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, promotionId_);
    }
    if (!getPromotionAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, promotionAmount_);
    }
    if (!getPromotionNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, promotionName_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof org.smart.website.commons.lib.OrderGetPromotionReply)) {
      return super.equals(obj);
    }
    org.smart.website.commons.lib.OrderGetPromotionReply other = (org.smart.website.commons.lib.OrderGetPromotionReply) obj;

    boolean result = true;
    result = result && getPromotionId()
        .equals(other.getPromotionId());
    result = result && getPromotionAmount()
        .equals(other.getPromotionAmount());
    result = result && getPromotionName()
        .equals(other.getPromotionName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROMOTIONID_FIELD_NUMBER;
    hash = (53 * hash) + getPromotionId().hashCode();
    hash = (37 * hash) + PROMOTIONAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPromotionAmount().hashCode();
    hash = (37 * hash) + PROMOTIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getPromotionName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(org.smart.website.commons.lib.OrderGetPromotionReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

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
   * Protobuf type {@code OrderGetPromotionReply}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:OrderGetPromotionReply)
          org.smart.website.commons.lib.OrderGetPromotionReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.smart.website.commons.lib.PromotionProto.internal_static_OrderGetPromotionReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.smart.website.commons.lib.PromotionProto.internal_static_OrderGetPromotionReply_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.smart.website.commons.lib.OrderGetPromotionReply.class, org.smart.website.commons.lib.OrderGetPromotionReply.Builder.class);
    }

    // Construct using org.smart.website.commons.lib.OrderGetPromotionReply.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      promotionId_ = "";

      promotionAmount_ = "";

      promotionName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return org.smart.website.commons.lib.PromotionProto.internal_static_OrderGetPromotionReply_descriptor;
    }

    public org.smart.website.commons.lib.OrderGetPromotionReply getDefaultInstanceForType() {
      return org.smart.website.commons.lib.OrderGetPromotionReply.getDefaultInstance();
    }

    public org.smart.website.commons.lib.OrderGetPromotionReply build() {
      org.smart.website.commons.lib.OrderGetPromotionReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.smart.website.commons.lib.OrderGetPromotionReply buildPartial() {
      org.smart.website.commons.lib.OrderGetPromotionReply result = new org.smart.website.commons.lib.OrderGetPromotionReply(this);
      result.promotionId_ = promotionId_;
      result.promotionAmount_ = promotionAmount_;
      result.promotionName_ = promotionName_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.smart.website.commons.lib.OrderGetPromotionReply) {
        return mergeFrom((org.smart.website.commons.lib.OrderGetPromotionReply) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.smart.website.commons.lib.OrderGetPromotionReply other) {
      if (other == org.smart.website.commons.lib.OrderGetPromotionReply.getDefaultInstance()) return this;
      if (!other.getPromotionId().isEmpty()) {
        promotionId_ = other.promotionId_;
        onChanged();
      }
      if (!other.getPromotionAmount().isEmpty()) {
        promotionAmount_ = other.promotionAmount_;
        onChanged();
      }
      if (!other.getPromotionName().isEmpty()) {
        promotionName_ = other.promotionName_;
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
      org.smart.website.commons.lib.OrderGetPromotionReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.smart.website.commons.lib.OrderGetPromotionReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object promotionId_ = "";
    /**
     * <code>string PromotionId = 1;</code>
     */
    public java.lang.String getPromotionId() {
      java.lang.Object ref = promotionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        promotionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PromotionId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPromotionIdBytes() {
      java.lang.Object ref = promotionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        promotionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PromotionId = 1;</code>
     */
    public Builder setPromotionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      promotionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PromotionId = 1;</code>
     */
    public Builder clearPromotionId() {
      
      promotionId_ = getDefaultInstance().getPromotionId();
      onChanged();
      return this;
    }
    /**
     * <code>string PromotionId = 1;</code>
     */
    public Builder setPromotionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      promotionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object promotionAmount_ = "";
    /**
     * <code>string PromotionAmount = 2;</code>
     */
    public java.lang.String getPromotionAmount() {
      java.lang.Object ref = promotionAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        promotionAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PromotionAmount = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPromotionAmountBytes() {
      java.lang.Object ref = promotionAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        promotionAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PromotionAmount = 2;</code>
     */
    public Builder setPromotionAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      promotionAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PromotionAmount = 2;</code>
     */
    public Builder clearPromotionAmount() {
      
      promotionAmount_ = getDefaultInstance().getPromotionAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string PromotionAmount = 2;</code>
     */
    public Builder setPromotionAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      promotionAmount_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object promotionName_ = "";
    /**
     * <code>string PromotionName = 3;</code>
     */
    public java.lang.String getPromotionName() {
      java.lang.Object ref = promotionName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        promotionName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PromotionName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPromotionNameBytes() {
      java.lang.Object ref = promotionName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        promotionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PromotionName = 3;</code>
     */
    public Builder setPromotionName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      promotionName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PromotionName = 3;</code>
     */
    public Builder clearPromotionName() {
      
      promotionName_ = getDefaultInstance().getPromotionName();
      onChanged();
      return this;
    }
    /**
     * <code>string PromotionName = 3;</code>
     */
    public Builder setPromotionNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      promotionName_ = value;
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


    // @@protoc_insertion_point(builder_scope:OrderGetPromotionReply)
  }

  // @@protoc_insertion_point(class_scope:OrderGetPromotionReply)
  private static final org.smart.website.commons.lib.OrderGetPromotionReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.smart.website.commons.lib.OrderGetPromotionReply();
  }

  public static org.smart.website.commons.lib.OrderGetPromotionReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderGetPromotionReply>
      PARSER = new com.google.protobuf.AbstractParser<OrderGetPromotionReply>() {
    public OrderGetPromotionReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new OrderGetPromotionReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderGetPromotionReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderGetPromotionReply> getParserForType() {
    return PARSER;
  }

  public org.smart.website.commons.lib.OrderGetPromotionReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

