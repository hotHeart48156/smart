// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package org.smart.website.commons.lib;

public final class ProductProto {
  private ProductProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderToProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderToProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderGetProductReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderGetProductReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CouponToProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CouponToProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CouponGetProductReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CouponGetProductReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rProduct.proto\"*\n\025OrderToProductRequest" +
      "\022\021\n\tproductId\030\001 \001(\t\"\353\001\n\024OrderGetProductR" +
      "eply\022\021\n\tproductId\030\001 \001(\t\022\023\n\013productName\030\002" +
      " \001(\t\022\022\n\nproductPic\030\003 \001(\t\022\024\n\014productPrice" +
      "\030\004 \001(\t\022\026\n\016productSkuCode\030\005 \001(\t\022\024\n\014produc" +
      "tSkuId\030\006 \001(\t\022\031\n\021productCategoryId\030\007 \001(\t\022" +
      "\035\n\025productSalesAttribute\030\010 \001(\t\022\031\n\021produc" +
      "tAttributes\030\t \001(\t\"+\n\026CouponToProductRequ" +
      "est\022\021\n\tproductId\030\001 \001(\t\"Z\n\025CouponGetProdu" +
      "ctReply\022\021\n\tproductId\030\001 \001(\t\022\023\n\013productNam",
      "e\030\002 \001(\t\022\031\n\021productAttributes\030\003 \001(\t2^\n\026Or" +
      "derGetProductMessage\022D\n\021GetOrderToProduc" +
      "t\022\026.OrderToProductRequest\032\025.OrderGetProd" +
      "uctReply\"\0002b\n\020CouponGetProduct\022N\n\031GetCou" +
      "ponToProductMessage\022\027.CouponToProductReq" +
      "uest\032\026.CouponGetProductReply\"\000B/\n\035org.sm" +
      "art.website.commons.libB\014ProductProtoP\001b" +
      "\006proto3"
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
    internal_static_OrderToProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OrderToProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderToProductRequest_descriptor,
        new java.lang.String[] { "ProductId", });
    internal_static_OrderGetProductReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_OrderGetProductReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderGetProductReply_descriptor,
        new java.lang.String[] { "ProductId", "ProductName", "ProductPic", "ProductPrice", "ProductSkuCode", "ProductSkuId", "ProductCategoryId", "ProductSalesAttribute", "ProductAttributes", });
    internal_static_CouponToProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CouponToProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CouponToProductRequest_descriptor,
        new java.lang.String[] { "ProductId", });
    internal_static_CouponGetProductReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CouponGetProductReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CouponGetProductReply_descriptor,
        new java.lang.String[] { "ProductId", "ProductName", "ProductAttributes", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
