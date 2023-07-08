package net.vbunova.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: streetLightService.proto")
public final class streetLightServiceGrpc {

  private streetLightServiceGrpc() {}

  public static final String SERVICE_NAME = "streetLightService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLightService.ActivateLightsRequest,
      net.vbunova.grpc.StreetLightService.ActivateLightsResponse> getActivateLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateLights",
      requestType = net.vbunova.grpc.StreetLightService.ActivateLightsRequest.class,
      responseType = net.vbunova.grpc.StreetLightService.ActivateLightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLightService.ActivateLightsRequest,
      net.vbunova.grpc.StreetLightService.ActivateLightsResponse> getActivateLightsMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLightService.ActivateLightsRequest, net.vbunova.grpc.StreetLightService.ActivateLightsResponse> getActivateLightsMethod;
    if ((getActivateLightsMethod = streetLightServiceGrpc.getActivateLightsMethod) == null) {
      synchronized (streetLightServiceGrpc.class) {
        if ((getActivateLightsMethod = streetLightServiceGrpc.getActivateLightsMethod) == null) {
          streetLightServiceGrpc.getActivateLightsMethod = getActivateLightsMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.StreetLightService.ActivateLightsRequest, net.vbunova.grpc.StreetLightService.ActivateLightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "streetLightService", "activateLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLightService.ActivateLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLightService.ActivateLightsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new streetLightServiceMethodDescriptorSupplier("activateLights"))
                  .build();
          }
        }
     }
     return getActivateLightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static streetLightServiceStub newStub(io.grpc.Channel channel) {
    return new streetLightServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static streetLightServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new streetLightServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static streetLightServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new streetLightServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class streetLightServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void activateLights(net.vbunova.grpc.StreetLightService.ActivateLightsRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLightService.ActivateLightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateLightsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.vbunova.grpc.StreetLightService.ActivateLightsRequest,
                net.vbunova.grpc.StreetLightService.ActivateLightsResponse>(
                  this, METHODID_ACTIVATE_LIGHTS)))
          .build();
    }
  }

  /**
   */
  public static final class streetLightServiceStub extends io.grpc.stub.AbstractStub<streetLightServiceStub> {
    private streetLightServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private streetLightServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected streetLightServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new streetLightServiceStub(channel, callOptions);
    }

    /**
     */
    public void activateLights(net.vbunova.grpc.StreetLightService.ActivateLightsRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLightService.ActivateLightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateLightsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class streetLightServiceBlockingStub extends io.grpc.stub.AbstractStub<streetLightServiceBlockingStub> {
    private streetLightServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private streetLightServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected streetLightServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new streetLightServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.vbunova.grpc.StreetLightService.ActivateLightsResponse activateLights(net.vbunova.grpc.StreetLightService.ActivateLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateLightsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class streetLightServiceFutureStub extends io.grpc.stub.AbstractStub<streetLightServiceFutureStub> {
    private streetLightServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private streetLightServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected streetLightServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new streetLightServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.vbunova.grpc.StreetLightService.ActivateLightsResponse> activateLights(
        net.vbunova.grpc.StreetLightService.ActivateLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateLightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_LIGHTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final streetLightServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(streetLightServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE_LIGHTS:
          serviceImpl.activateLights((net.vbunova.grpc.StreetLightService.ActivateLightsRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLightService.ActivateLightsResponse>) responseObserver);
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

  private static abstract class streetLightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    streetLightServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.vbunova.grpc.StreetLightService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("streetLightService");
    }
  }

  private static final class streetLightServiceFileDescriptorSupplier
      extends streetLightServiceBaseDescriptorSupplier {
    streetLightServiceFileDescriptorSupplier() {}
  }

  private static final class streetLightServiceMethodDescriptorSupplier
      extends streetLightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    streetLightServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (streetLightServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new streetLightServiceFileDescriptorSupplier())
              .addMethod(getActivateLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
