// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package org.smart.website.commons.lib;

/**
 * Protobuf type {@code CouponGetProductReply}
 */
public  final class CouponGetProductReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CouponGetProductReply)
    CouponGetProductReplyOrBuilder {
  public static final int PRODUCTID_FIELD_NUMBER = 1;
  public static final int PRODUCTNAME_FIELD_NUMBER = 2;
  public static final int PRODUCTATTRIBUTES_FIELD_NUMBER = 3;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:CouponGetProductReply)
  private static final org.smart.website.commons.lib.CouponGetProductReply DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<CouponGetProductReply>
      PARSER = new com.google.protobuf.AbstractParser<CouponGetProductReply>() {
    public CouponGetProductReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CouponGetProductReply(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new org.smart.website.commons.lib.CouponGetProductReply();
  }

  private volatile java.lang.Object productId_;
  private volatile java.lang.Object productName_;
  private volatile java.lang.Object productAttributes_;
  private byte memoizedIsInitialized = -1;
  // Use CouponGetProductReply.newBuilder() to construct.
  private CouponGetProductReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CouponGetProductReply() {
    productId_ = "";
    productName_ = "";
    productAttributes_ = "";
  }
  private CouponGetProductReply(
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

            productId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            productName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            productAttributes_ = s;
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
    return org.smart.website.commons.lib.ProductProto.internal_static_CouponGetProductReply_descriptor;
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(org.smart.website.commons.lib.CouponGetProductReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static org.smart.website.commons.lib.CouponGetProductReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<CouponGetProductReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.smart.website.commons.lib.ProductProto.internal_static_CouponGetProductReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.smart.website.commons.lib.CouponGetProductReply.class, org.smart.website.commons.lib.CouponGetProductReply.Builder.class);
  }

  /**
   * <code>string productId = 1;</code>
   */
  public java.lang.String getProductId() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productId_ = s;
      return s;
    }
  }

  /**
   * <code>string productId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProductIdBytes() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  /**
   * <code>string productName = 2;</code>
   */
  public java.lang.String getProductName() {
    java.lang.Object ref = productName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productName_ = s;
      return s;
    }
  }

  /**
   * <code>string productName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProductNameBytes() {
    java.lang.Object ref = productName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  /**
   * <code>string productAttributes = 3;</code>
   */
  public java.lang.String getProductAttributes() {
    java.lang.Object ref = productAttributes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productAttributes_ = s;
      return s;
    }
  }

  /**
   * <code>string productAttributes = 3;</code>
   */
  public com.google.protobuf.ByteString
      getProductAttributesBytes() {
    java.lang.Object ref = productAttributes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productAttributes_ = b;
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
    if (!getProductIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productId_);
    }
    if (!getProductNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, productName_);
    }
    if (!getProductAttributesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, productAttributes_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProductIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productId_);
    }
    if (!getProductNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, productName_);
    }
    if (!getProductAttributesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, productAttributes_);
    }
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.smart.website.commons.lib.CouponGetProductReply)) {
      return super.equals(obj);
    }
    org.smart.website.commons.lib.CouponGetProductReply other = (org.smart.website.commons.lib.CouponGetProductReply) obj;

    boolean result = true;
    result = result && getProductId()
        .equals(other.getProductId());
    result = result && getProductName()
        .equals(other.getProductName());
    result = result && getProductAttributes()
        .equals(other.getProductAttributes());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId().hashCode();
    hash = (37 * hash) + PRODUCTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getProductName().hashCode();
    hash = (37 * hash) + PRODUCTATTRIBUTES_FIELD_NUMBER;
    hash = (53 * hash) + getProductAttributes().hashCode();
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
  public com.google.protobuf.Parser<CouponGetProductReply> getParserForType() {
    return PARSER;
  }

  public org.smart.website.commons.lib.CouponGetProductReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code CouponGetProductReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CouponGetProductReply)
      org.smart.website.commons.lib.CouponGetProductReplyOrBuilder {
    private java.lang.Object productId_ = "";
    private java.lang.Object productName_ = "";
    private java.lang.Object productAttributes_ = "";

    // Construct using org.smart.website.commons.lib.CouponGetProductReply.newBuilder()
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
      return org.smart.website.commons.lib.ProductProto.internal_static_CouponGetProductReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.smart.website.commons.lib.ProductProto.internal_static_CouponGetProductReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.smart.website.commons.lib.CouponGetProductReply.class, org.smart.website.commons.lib.CouponGetProductReply.Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    public Builder clear() {
      super.clear();
      productId_ = "";

      productName_ = "";

      productAttributes_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.smart.website.commons.lib.ProductProto.internal_static_CouponGetProductReply_descriptor;
    }

    public org.smart.website.commons.lib.CouponGetProductReply getDefaultInstanceForType() {
      return org.smart.website.commons.lib.CouponGetProductReply.getDefaultInstance();
    }

    public org.smart.website.commons.lib.CouponGetProductReply build() {
      org.smart.website.commons.lib.CouponGetProductReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.smart.website.commons.lib.CouponGetProductReply buildPartial() {
      org.smart.website.commons.lib.CouponGetProductReply result = new org.smart.website.commons.lib.CouponGetProductReply(this);
      result.productId_ = productId_;
      result.productName_ = productName_;
      result.productAttributes_ = productAttributes_;
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
      if (other instanceof org.smart.website.commons.lib.CouponGetProductReply) {
        return mergeFrom((org.smart.website.commons.lib.CouponGetProductReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.smart.website.commons.lib.CouponGetProductReply other) {
      if (other == org.smart.website.commons.lib.CouponGetProductReply.getDefaultInstance()) return this;
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        onChanged();
      }
      if (!other.getProductName().isEmpty()) {
        productName_ = other.productName_;
        onChanged();
      }
      if (!other.getProductAttributes().isEmpty()) {
        productAttributes_ = other.productAttributes_;
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
      org.smart.website.commons.lib.CouponGetProductReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.smart.website.commons.lib.CouponGetProductReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    /**
     * <code>string productId = 1;</code>
     */
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string productId = 1;</code>
     */
    public Builder setProductId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      productId_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string productId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string productId = 1;</code>
     */
    public Builder setProductIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      productId_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string productId = 1;</code>
     */
    public Builder clearProductId() {

      productId_ = getDefaultInstance().getProductId();
      onChanged();
      return this;
    }

    /**
     * <code>string productName = 2;</code>
     */
    public java.lang.String getProductName() {
      java.lang.Object ref = productName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string productName = 2;</code>
     */
    public Builder setProductName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      productName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string productName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProductNameBytes() {
      java.lang.Object ref = productName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string productName = 2;</code>
     */
    public Builder setProductNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      productName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string productName = 2;</code>
     */
    public Builder clearProductName() {

      productName_ = getDefaultInstance().getProductName();
      onChanged();
      return this;
    }

    /**
     * <code>string productAttributes = 3;</code>
     */
    public java.lang.String getProductAttributes() {
      java.lang.Object ref = productAttributes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productAttributes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string productAttributes = 3;</code>
     */
    public Builder setProductAttributes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      productAttributes_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string productAttributes = 3;</code>
     */
    public com.google.protobuf.ByteString
        getProductAttributesBytes() {
      java.lang.Object ref = productAttributes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productAttributes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string productAttributes = 3;</code>
     */
    public Builder setProductAttributesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      productAttributes_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string productAttributes = 3;</code>
     */
    public Builder clearProductAttributes() {

      productAttributes_ = getDefaultInstance().getProductAttributes();
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


    // @@protoc_insertion_point(builder_scope:CouponGetProductReply)
  }

}

