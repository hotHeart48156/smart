// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Coupon.proto

package org.smart.website.commons.lib;

public final class CouponProto {
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderToCouponRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderToCouponRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderGetCouponReply_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderGetCouponReply_fieldAccessorTable;
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\014Coupon.proto\"9\n\024OrderToCouponRequest\022\016" +
      "\n\006userId\030\001 \001(\t\022\021\n\tproductId\030\002 \001(\t\"Q\n\023Ord" +
      "erGetCouponReply\022\020\n\010couponId\030\001 \001(\t\022\024\n\014co" +
      "uponAmount\030\002 \001(\t\022\022\n\ncouponName\030\003 \001(\t2Z\n\025" +
      "OrderGetCouponMessage\022A\n\020GetOrderToCoupo" +
      "n\022\025.OrderToCouponRequest\032\024.OrderGetCoupo" +
      "nReply\"\000B.\n\035org.smart.website.commons.li" +
      "bB\013CouponProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_OrderToCouponRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OrderToCouponRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderToCouponRequest_descriptor,
        new java.lang.String[] { "UserId", "ProductId", });
    internal_static_OrderGetCouponReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_OrderGetCouponReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderGetCouponReply_descriptor,
        new java.lang.String[] { "CouponId", "CouponAmount", "CouponName", });
  }
  private CouponProto() {}

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }

  // @@protoc_insertion_point(outer_class_scope)
}
