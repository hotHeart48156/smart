// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Group.proto

package org.smart.website.commons.lib;

/**
 * Protobuf type {@code OrderGetGroupReply}
 */
public  final class OrderGetGroupReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OrderGetGroupReply)
    OrderGetGroupReplyOrBuilder {
  // Use OrderGetGroupReply.newBuilder() to construct.
  private OrderGetGroupReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderGetGroupReply() {
    groupId_ = "";
    groupAmount_ = "";
    groupName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private OrderGetGroupReply(
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

            groupId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            groupAmount_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            groupName_ = s;
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
    return org.smart.website.commons.lib.GroupProto.internal_static_OrderGetGroupReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.smart.website.commons.lib.GroupProto.internal_static_OrderGetGroupReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    org.smart.website.commons.lib.OrderGetGroupReply.class, org.smart.website.commons.lib.OrderGetGroupReply.Builder.class);
  }

  public static final int GROUPID_FIELD_NUMBER = 1;
  private volatile java.lang.Object groupId_;
  /**
   * <code>string GroupId = 1;</code>
   */
  public java.lang.String getGroupId() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupId_ = s;
      return s;
    }
  }
  /**
   * <code>string GroupId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGroupIdBytes() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUPAMOUNT_FIELD_NUMBER = 2;
  private volatile java.lang.Object groupAmount_;
  /**
   * <code>string GroupAmount = 2;</code>
   */
  public java.lang.String getGroupAmount() {
    java.lang.Object ref = groupAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string GroupAmount = 2;</code>
   */
  public com.google.protobuf.ByteString
      getGroupAmountBytes() {
    java.lang.Object ref = groupAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUPNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object groupName_;
  /**
   * <code>string GroupName = 3;</code>
   */
  public java.lang.String getGroupName() {
    java.lang.Object ref = groupName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupName_ = s;
      return s;
    }
  }
  /**
   * <code>string GroupName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getGroupNameBytes() {
    java.lang.Object ref = groupName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupName_ = b;
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
    if (!getGroupIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
    }
    if (!getGroupAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, groupAmount_);
    }
    if (!getGroupNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, groupName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGroupIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
    }
    if (!getGroupAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, groupAmount_);
    }
    if (!getGroupNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, groupName_);
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
    if (!(obj instanceof org.smart.website.commons.lib.OrderGetGroupReply)) {
      return super.equals(obj);
    }
    org.smart.website.commons.lib.OrderGetGroupReply other = (org.smart.website.commons.lib.OrderGetGroupReply) obj;

    boolean result = true;
    result = result && getGroupId()
        .equals(other.getGroupId());
    result = result && getGroupAmount()
        .equals(other.getGroupAmount());
    result = result && getGroupName()
        .equals(other.getGroupName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GROUPID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId().hashCode();
    hash = (37 * hash) + GROUPAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getGroupAmount().hashCode();
    hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
    hash = (53 * hash) + getGroupName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply parseFrom(
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

  public static Builder newBuilder(org.smart.website.commons.lib.OrderGetGroupReply prototype) {
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
   * Protobuf type {@code OrderGetGroupReply}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:OrderGetGroupReply)
          org.smart.website.commons.lib.OrderGetGroupReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.smart.website.commons.lib.GroupProto.internal_static_OrderGetGroupReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.smart.website.commons.lib.GroupProto.internal_static_OrderGetGroupReply_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.smart.website.commons.lib.OrderGetGroupReply.class, org.smart.website.commons.lib.OrderGetGroupReply.Builder.class);
    }

    // Construct using org.smart.website.commons.lib.OrderGetGroupReply.newBuilder()
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
      groupId_ = "";

      groupAmount_ = "";

      groupName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return org.smart.website.commons.lib.GroupProto.internal_static_OrderGetGroupReply_descriptor;
    }

    public org.smart.website.commons.lib.OrderGetGroupReply getDefaultInstanceForType() {
      return org.smart.website.commons.lib.OrderGetGroupReply.getDefaultInstance();
    }

    public org.smart.website.commons.lib.OrderGetGroupReply build() {
      org.smart.website.commons.lib.OrderGetGroupReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.smart.website.commons.lib.OrderGetGroupReply buildPartial() {
      org.smart.website.commons.lib.OrderGetGroupReply result = new org.smart.website.commons.lib.OrderGetGroupReply(this);
      result.groupId_ = groupId_;
      result.groupAmount_ = groupAmount_;
      result.groupName_ = groupName_;
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
      if (other instanceof org.smart.website.commons.lib.OrderGetGroupReply) {
        return mergeFrom((org.smart.website.commons.lib.OrderGetGroupReply) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.smart.website.commons.lib.OrderGetGroupReply other) {
      if (other == org.smart.website.commons.lib.OrderGetGroupReply.getDefaultInstance()) return this;
      if (!other.getGroupId().isEmpty()) {
        groupId_ = other.groupId_;
        onChanged();
      }
      if (!other.getGroupAmount().isEmpty()) {
        groupAmount_ = other.groupAmount_;
        onChanged();
      }
      if (!other.getGroupName().isEmpty()) {
        groupName_ = other.groupName_;
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
      org.smart.website.commons.lib.OrderGetGroupReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.smart.website.commons.lib.OrderGetGroupReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object groupId_ = "";
    /**
     * <code>string GroupId = 1;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string GroupId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string GroupId = 1;</code>
     */
    public Builder setGroupId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string GroupId = 1;</code>
     */
    public Builder clearGroupId() {
      
      groupId_ = getDefaultInstance().getGroupId();
      onChanged();
      return this;
    }
    /**
     * <code>string GroupId = 1;</code>
     */
    public Builder setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object groupAmount_ = "";
    /**
     * <code>string GroupAmount = 2;</code>
     */
    public java.lang.String getGroupAmount() {
      java.lang.Object ref = groupAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string GroupAmount = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupAmountBytes() {
      java.lang.Object ref = groupAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string GroupAmount = 2;</code>
     */
    public Builder setGroupAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string GroupAmount = 2;</code>
     */
    public Builder clearGroupAmount() {
      
      groupAmount_ = getDefaultInstance().getGroupAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string GroupAmount = 2;</code>
     */
    public Builder setGroupAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupAmount_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object groupName_ = "";
    /**
     * <code>string GroupName = 3;</code>
     */
    public java.lang.String getGroupName() {
      java.lang.Object ref = groupName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string GroupName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGroupNameBytes() {
      java.lang.Object ref = groupName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string GroupName = 3;</code>
     */
    public Builder setGroupName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string GroupName = 3;</code>
     */
    public Builder clearGroupName() {
      
      groupName_ = getDefaultInstance().getGroupName();
      onChanged();
      return this;
    }
    /**
     * <code>string GroupName = 3;</code>
     */
    public Builder setGroupNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupName_ = value;
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


    // @@protoc_insertion_point(builder_scope:OrderGetGroupReply)
  }

  // @@protoc_insertion_point(class_scope:OrderGetGroupReply)
  private static final org.smart.website.commons.lib.OrderGetGroupReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.smart.website.commons.lib.OrderGetGroupReply();
  }

  public static org.smart.website.commons.lib.OrderGetGroupReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderGetGroupReply>
      PARSER = new com.google.protobuf.AbstractParser<OrderGetGroupReply>() {
    public OrderGetGroupReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new OrderGetGroupReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderGetGroupReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderGetGroupReply> getParserForType() {
    return PARSER;
  }

  public org.smart.website.commons.lib.OrderGetGroupReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

