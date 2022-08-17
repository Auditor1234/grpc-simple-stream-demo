package com.li.rpc.rpcservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: GrpcServiceApis.proto")
public final class GrpcServiceApisGrpc {

  private GrpcServiceApisGrpc() {}

  public static final String SERVICE_NAME = "com.li.rpc.GrpcServiceApis";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.li.rpc.domain.DataRequest,
      com.li.rpc.domain.DataResponse> getGetNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getName",
      requestType = com.li.rpc.domain.DataRequest.class,
      responseType = com.li.rpc.domain.DataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.li.rpc.domain.DataRequest,
      com.li.rpc.domain.DataResponse> getGetNameMethod() {
    io.grpc.MethodDescriptor<com.li.rpc.domain.DataRequest, com.li.rpc.domain.DataResponse> getGetNameMethod;
    if ((getGetNameMethod = GrpcServiceApisGrpc.getGetNameMethod) == null) {
      synchronized (GrpcServiceApisGrpc.class) {
        if ((getGetNameMethod = GrpcServiceApisGrpc.getGetNameMethod) == null) {
          GrpcServiceApisGrpc.getGetNameMethod = getGetNameMethod =
              io.grpc.MethodDescriptor.<com.li.rpc.domain.DataRequest, com.li.rpc.domain.DataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.li.rpc.domain.DataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.li.rpc.domain.DataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceApisMethodDescriptorSupplier("getName"))
              .build();
        }
      }
    }
    return getGetNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcServiceApisStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceApisStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceApisStub>() {
        @java.lang.Override
        public GrpcServiceApisStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceApisStub(channel, callOptions);
        }
      };
    return GrpcServiceApisStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcServiceApisBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceApisBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceApisBlockingStub>() {
        @java.lang.Override
        public GrpcServiceApisBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceApisBlockingStub(channel, callOptions);
        }
      };
    return GrpcServiceApisBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcServiceApisFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceApisFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceApisFutureStub>() {
        @java.lang.Override
        public GrpcServiceApisFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceApisFutureStub(channel, callOptions);
        }
      };
    return GrpcServiceApisFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GrpcServiceApisImplBase implements io.grpc.BindableService {

    /**
     */
    public void getName(com.li.rpc.domain.DataRequest request,
        io.grpc.stub.StreamObserver<com.li.rpc.domain.DataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.li.rpc.domain.DataRequest,
                com.li.rpc.domain.DataResponse>(
                  this, METHODID_GET_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcServiceApisStub extends io.grpc.stub.AbstractAsyncStub<GrpcServiceApisStub> {
    private GrpcServiceApisStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceApisStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceApisStub(channel, callOptions);
    }

    /**
     */
    public void getName(com.li.rpc.domain.DataRequest request,
        io.grpc.stub.StreamObserver<com.li.rpc.domain.DataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcServiceApisBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcServiceApisBlockingStub> {
    private GrpcServiceApisBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceApisBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceApisBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.li.rpc.domain.DataResponse getName(com.li.rpc.domain.DataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcServiceApisFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcServiceApisFutureStub> {
    private GrpcServiceApisFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceApisFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceApisFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.li.rpc.domain.DataResponse> getName(
        com.li.rpc.domain.DataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NAME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcServiceApisImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcServiceApisImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NAME:
          serviceImpl.getName((com.li.rpc.domain.DataRequest) request,
              (io.grpc.stub.StreamObserver<com.li.rpc.domain.DataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GrpcServiceApisBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcServiceApisBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.li.rpc.rpcservice.GrpcServer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcServiceApis");
    }
  }

  private static final class GrpcServiceApisFileDescriptorSupplier
      extends GrpcServiceApisBaseDescriptorSupplier {
    GrpcServiceApisFileDescriptorSupplier() {}
  }

  private static final class GrpcServiceApisMethodDescriptorSupplier
      extends GrpcServiceApisBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcServiceApisMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GrpcServiceApisGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcServiceApisFileDescriptorSupplier())
              .addMethod(getGetNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
