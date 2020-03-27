// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Coupon.proto

package org.smart.website.commons.lib;

/**
 * Protobuf type {@code OrderGetCouponReply}
 */
public  final class OrderGetCouponReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OrderGetCouponReply)
    OrderGetCouponReplyOrBuilder {
  // Use OrderGetCouponReply.newBuilder() to construct.
  private OrderGetCouponReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderGetCouponReply() {
    couponId_ = "";
    couponAmount_ = "";
    couponName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private OrderGetCouponReply(
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

            couponId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            couponAmount_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            couponName_ = s;
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
    return org.smart.website.commons.lib.CouponProto.internal_static_OrderGetCouponReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.smart.website.commons.lib.CouponProto.internal_static_OrderGetCouponReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.smart.website.commons.lib.OrderGetCouponReply.class, org.smart.website.commons.lib.OrderGetCouponReply.Builder.class);
  }

  public static final int COUPONID_FIELD_NUMBER = 1;
  private volatile java.lang.Object couponId_;
  /**
   * <code>string couponId = 1;</code>
   */
  public java.lang.String getCouponId() {
    java.lang.Object ref = couponId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      couponId_ = s;
      return s;
    }
  }
  /**
   * <code>string couponId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCouponIdBytes() {
    java.lang.Object ref = couponId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      couponId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUPONAMOUNT_FIELD_NUMBER = 2;
  private volatile java.lang.Object couponAmount_;
  /**
   * <code>string couponAmount = 2;</code>
   */
  public java.lang.String getCouponAmount() {
    java.lang.Object ref = couponAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      couponAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string couponAmount = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCouponAmountBytes() {
    java.lang.Object ref = couponAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      couponAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUPONNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object couponName_;
  /**
   * <code>string couponName = 3;</code>
   */
  public java.lang.String getCouponName() {
    java.lang.Object ref = couponName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      couponName_ = s;
      return s;
    }
  }
  /**
   * <code>string couponName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCouponNameBytes() {
    java.lang.Object ref = couponName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      couponName_ = b;
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
    if (!getCouponIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, couponId_);
    }
    if (!getCouponAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, couponAmount_);
    }
    if (!getCouponNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, couponName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCouponIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, couponId_);
    }
    if (!getCouponAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, couponAmount_);
    }
    if (!getCouponNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, couponName_);
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
    if (!(obj instanceof org.smart.website.commons.lib.OrderGetCouponReply)) {
      return super.equals(obj);
    }
    org.smart.website.commons.lib.OrderGetCouponReply other = (org.smart.website.commons.lib.OrderGetCouponReply) obj;

    boolean result = true;
    result = result && getCouponId()
        .equals(other.getCouponId());
    result = result && getCouponAmount()
        .equals(other.getCouponAmount());
    result = result && getCouponName()
        .equals(other.getCouponName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COUPONID_FIELD_NUMBER;
    hash = (53 * hash) + getCouponId().hashCode();
    hash = (37 * hash) + COUPONAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCouponAmount().hashCode();
    hash = (37 * hash) + COUPONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCouponName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.smart.website.commons.lib.OrderGetCouponReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.smart.website.commons.lib.OrderGetCouponReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.smart.website.commons.lib.OrderGetCouponReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.smart.website.commons.lib.OrderGetCouponReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.smart.website.commons.lib.OrderGetCouponReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.smart.website.commons.lib.OrderGetCouponReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.smart.website.commons.lib.OrderGetCouponReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.smart.website.commons.lib.OrderGetCouponReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.smart.website.commons.lib.OrderGetCouponReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.smart.website.commons.lib.OrderGetCouponReply parseFrom(
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
  public static Builder newBuilder(org.smart.website.commons.lib.OrderGetCouponReply prototype) {
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
   * Protobuf type {@code OrderGetCouponReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OrderGetCouponReply)
      org.smart.website.commons.lib.OrderGetCouponReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.smart.website.commons.lib.CouponProto.internal_static_OrderGetCouponReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.smart.website.commons.lib.CouponProto.internal_static_OrderGetCouponReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.smart.website.commons.lib.OrderGetCouponReply.class, org.smart.website.commons.lib.OrderGetCouponReply.Builder.class);
    }

    // Construct using org.smart.website.commons.lib.OrderGetCouponReply.newBuilder()
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
      couponId_ = "";

      couponAmount_ = "";

      couponName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.smart.website.commons.lib.CouponProto.internal_static_OrderGetCouponReply_descriptor;
    }

    public org.smart.website.commons.lib.OrderGetCouponReply getDefaultInstanceForType() {
      return org.smart.website.commons.lib.OrderGetCouponReply.getDefaultInstance();
    }

    public org.smart.website.commons.lib.OrderGetCouponReply build() {
      org.smart.website.commons.lib.OrderGetCouponReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.smart.website.commons.lib.OrderGetCouponReply buildPartial() {
      org.smart.website.commons.lib.OrderGetCouponReply result = new org.smart.website.commons.lib.OrderGetCouponReply(this);
      result.couponId_ = couponId_;
      result.couponAmount_ = couponAmount_;
      result.couponName_ = couponName_;
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
      if (other instanceof org.smart.website.commons.lib.OrderGetCouponReply) {
        return mergeFrom((org.smart.website.commons.lib.OrderGetCouponReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.smart.website.commons.lib.OrderGetCouponReply other) {
      if (other == org.smart.website.commons.lib.OrderGetCouponReply.getDefaultInstance()) return this;
      if (!other.getCouponId().isEmpty()) {
        couponId_ = other.couponId_;
        onChanged();
      }
      if (!other.getCouponAmount().isEmpty()) {
        couponAmount_ = other.couponAmount_;
        onChanged();
      }
      if (!other.getCouponName().isEmpty()) {
        couponName_ = other.couponName_;
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
      org.smart.website.commons.lib.OrderGetCouponReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.smart.website.commons.lib.OrderGetCouponReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object couponId_ = "";
    /**
     * <code>string couponId = 1;</code>
     */
    public java.lang.String getCouponId() {
      java.lang.Object ref = couponId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        couponId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string couponId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCouponIdBytes() {
      java.lang.Object ref = couponId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        couponId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string couponId = 1;</code>
     */
    public Builder setCouponId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      couponId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string couponId = 1;</code>
     */
    public Builder clearCouponId() {
      
      couponId_ = getDefaultInstance().getCouponId();
      onChanged();
      return this;
    }
    /**
     * <code>string couponId = 1;</code>
     */
    public Builder setCouponIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      couponId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object couponAmount_ = "";
    /**
     * <code>string couponAmount = 2;</code>
     */
    public java.lang.String getCouponAmount() {
      java.lang.Object ref = couponAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        couponAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string couponAmount = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCouponAmountBytes() {
      java.lang.Object ref = couponAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        couponAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string couponAmount = 2;</code>
     */
    public Builder setCouponAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      couponAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string couponAmount = 2;</code>
     */
    public Builder clearCouponAmount() {
      
      couponAmount_ = getDefaultInstance().getCouponAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string couponAmount = 2;</code>
     */
    public Builder setCouponAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      couponAmount_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object couponName_ = "";
    /**
     * <code>string couponName = 3;</code>
     */
    public java.lang.String getCouponName() {
      java.lang.Object ref = couponName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        couponName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string couponName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCouponNameBytes() {
      java.lang.Object ref = couponName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        couponName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string couponName = 3;</code>
     */
    public Builder setCouponName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      couponName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string couponName = 3;</code>
     */
    public Builder clearCouponName() {
      
      couponName_ = getDefaultInstance().getCouponName();
      onChanged();
      return this;
    }
    /**
     * <code>string couponName = 3;</code>
     */
    public Builder setCouponNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      couponName_ = value;
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


    // @@protoc_insertion_point(builder_scope:OrderGetCouponReply)
  }

  // @@protoc_insertion_point(class_scope:OrderGetCouponReply)
  private static final org.smart.website.commons.lib.OrderGetCouponReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.smart.website.commons.lib.OrderGetCouponReply();
  }

  public static org.smart.website.commons.lib.OrderGetCouponReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderGetCouponReply>
      PARSER = new com.google.protobuf.AbstractParser<OrderGetCouponReply>() {
    public OrderGetCouponReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new OrderGetCouponReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderGetCouponReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderGetCouponReply> getParserForType() {
    return PARSER;
  }

  public org.smart.website.commons.lib.OrderGetCouponReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

