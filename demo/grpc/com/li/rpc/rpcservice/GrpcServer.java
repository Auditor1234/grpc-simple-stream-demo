// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcServiceApis.proto

package com.li.rpc.rpcservice;

public final class GrpcServer {
  private GrpcServer() {}
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
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GrpcServiceApis.proto\022\ncom.li.rpc\032\026Grp" +
      "cServiceModel.proto2Q\n\017GrpcServiceApis\022>" +
      "\n\007getName\022\027.com.li.rpc.DataRequest\032\030.com" +
      ".li.rpc.DataResponse\"\000B%\n\025com.li.rpc.rpc" +
      "serviceB\nGrpcServerP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.li.rpc.domain.GrpcServiceModel.getDescriptor(),
        });
    com.li.rpc.domain.GrpcServiceModel.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
