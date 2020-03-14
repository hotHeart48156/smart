// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Market.proto

package org.smart.website.commons.lib;

/**
 * Protobuf type {@code OrderGetMarketReply}
 */
public  final class OrderGetMarketReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OrderGetMarketReply)
    OrderGetMarketReplyOrBuilder {
  // Use OrderGetMarketReply.newBuilder() to construct.
  private OrderGetMarketReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderGetMarketReply() {
    marketId_ = "";
    marketAmount_ = "";
    marketName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private OrderGetMarketReply(
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

            marketId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            marketAmount_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            marketName_ = s;
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
    return MarketProto.internal_static_OrderGetMarketReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MarketProto.internal_static_OrderGetMarketReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            OrderGetMarketReply.class, OrderGetMarketReply.Builder.class);
  }

  public static final int MARKETID_FIELD_NUMBER = 1;
  private volatile java.lang.Object marketId_;
  /**
   * <code>string MarketId = 1;</code>
   */
  public java.lang.String getMarketId() {
    java.lang.Object ref = marketId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      marketId_ = s;
      return s;
    }
  }
  /**
   * <code>string MarketId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMarketIdBytes() {
    java.lang.Object ref = marketId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      marketId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MARKETAMOUNT_FIELD_NUMBER = 2;
  private volatile java.lang.Object marketAmount_;
  /**
   * <code>string MarketAmount = 2;</code>
   */
  public java.lang.String getMarketAmount() {
    java.lang.Object ref = marketAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      marketAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string MarketAmount = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMarketAmountBytes() {
    java.lang.Object ref = marketAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      marketAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MARKETNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object marketName_;
  /**
   * <code>string MarketName = 3;</code>
   */
  public java.lang.String getMarketName() {
    java.lang.Object ref = marketName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      marketName_ = s;
      return s;
    }
  }
  /**
   * <code>string MarketName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMarketNameBytes() {
    java.lang.Object ref = marketName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      marketName_ = b;
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
    if (!getMarketIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, marketId_);
    }
    if (!getMarketAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, marketAmount_);
    }
    if (!getMarketNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, marketName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMarketIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, marketId_);
    }
    if (!getMarketAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, marketAmount_);
    }
    if (!getMarketNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, marketName_);
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
    if (!(obj instanceof OrderGetMarketReply)) {
      return super.equals(obj);
    }
    OrderGetMarketReply other = (OrderGetMarketReply) obj;

    boolean result = true;
    result = result && getMarketId()
        .equals(other.getMarketId());
    result = result && getMarketAmount()
        .equals(other.getMarketAmount());
    result = result && getMarketName()
        .equals(other.getMarketName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MARKETID_FIELD_NUMBER;
    hash = (53 * hash) + getMarketId().hashCode();
    hash = (37 * hash) + MARKETAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMarketAmount().hashCode();
    hash = (37 * hash) + MARKETNAME_FIELD_NUMBER;
    hash = (53 * hash) + getMarketName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static OrderGetMarketReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static OrderGetMarketReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static OrderGetMarketReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static OrderGetMarketReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static OrderGetMarketReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static OrderGetMarketReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static OrderGetMarketReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static OrderGetMarketReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static OrderGetMarketReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static OrderGetMarketReply parseFrom(
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
  public static Builder newBuilder(OrderGetMarketReply prototype) {
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
   * Protobuf type {@code OrderGetMarketReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OrderGetMarketReply)
          OrderGetMarketReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MarketProto.internal_static_OrderGetMarketReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MarketProto.internal_static_OrderGetMarketReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              OrderGetMarketReply.class, OrderGetMarketReply.Builder.class);
    }

    // Construct using com.smart.website.commons.lib.OrderGetMarketReply.newBuilder()
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
      marketId_ = "";

      marketAmount_ = "";

      marketName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MarketProto.internal_static_OrderGetMarketReply_descriptor;
    }

    public OrderGetMarketReply getDefaultInstanceForType() {
      return OrderGetMarketReply.getDefaultInstance();
    }

    public OrderGetMarketReply build() {
      OrderGetMarketReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public OrderGetMarketReply buildPartial() {
      OrderGetMarketReply result = new OrderGetMarketReply(this);
      result.marketId_ = marketId_;
      result.marketAmount_ = marketAmount_;
      result.marketName_ = marketName_;
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
      if (other instanceof OrderGetMarketReply) {
        return mergeFrom((OrderGetMarketReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(OrderGetMarketReply other) {
      if (other == OrderGetMarketReply.getDefaultInstance()) return this;
      if (!other.getMarketId().isEmpty()) {
        marketId_ = other.marketId_;
        onChanged();
      }
      if (!other.getMarketAmount().isEmpty()) {
        marketAmount_ = other.marketAmount_;
        onChanged();
      }
      if (!other.getMarketName().isEmpty()) {
        marketName_ = other.marketName_;
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
      OrderGetMarketReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (OrderGetMarketReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object marketId_ = "";
    /**
     * <code>string MarketId = 1;</code>
     */
    public java.lang.String getMarketId() {
      java.lang.Object ref = marketId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        marketId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string MarketId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMarketIdBytes() {
      java.lang.Object ref = marketId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        marketId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string MarketId = 1;</code>
     */
    public Builder setMarketId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      marketId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string MarketId = 1;</code>
     */
    public Builder clearMarketId() {
      
      marketId_ = getDefaultInstance().getMarketId();
      onChanged();
      return this;
    }
    /**
     * <code>string MarketId = 1;</code>
     */
    public Builder setMarketIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      marketId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object marketAmount_ = "";
    /**
     * <code>string MarketAmount = 2;</code>
     */
    public java.lang.String getMarketAmount() {
      java.lang.Object ref = marketAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        marketAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string MarketAmount = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMarketAmountBytes() {
      java.lang.Object ref = marketAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        marketAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string MarketAmount = 2;</code>
     */
    public Builder setMarketAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      marketAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string MarketAmount = 2;</code>
     */
    public Builder clearMarketAmount() {
      
      marketAmount_ = getDefaultInstance().getMarketAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string MarketAmount = 2;</code>
     */
    public Builder setMarketAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      marketAmount_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object marketName_ = "";
    /**
     * <code>string MarketName = 3;</code>
     */
    public java.lang.String getMarketName() {
      java.lang.Object ref = marketName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        marketName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string MarketName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMarketNameBytes() {
      java.lang.Object ref = marketName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        marketName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string MarketName = 3;</code>
     */
    public Builder setMarketName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      marketName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string MarketName = 3;</code>
     */
    public Builder clearMarketName() {
      
      marketName_ = getDefaultInstance().getMarketName();
      onChanged();
      return this;
    }
    /**
     * <code>string MarketName = 3;</code>
     */
    public Builder setMarketNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      marketName_ = value;
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


    // @@protoc_insertion_point(builder_scope:OrderGetMarketReply)
  }

  // @@protoc_insertion_point(class_scope:OrderGetMarketReply)
  private static final OrderGetMarketReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new OrderGetMarketReply();
  }

  public static OrderGetMarketReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderGetMarketReply>
      PARSER = new com.google.protobuf.AbstractParser<OrderGetMarketReply>() {
    public OrderGetMarketReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new OrderGetMarketReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderGetMarketReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderGetMarketReply> getParserForType() {
    return PARSER;
  }

  public OrderGetMarketReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

