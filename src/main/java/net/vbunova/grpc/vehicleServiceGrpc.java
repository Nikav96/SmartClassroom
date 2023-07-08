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
    comments = "Source: vehicleService.proto")
public final class vehicleServiceGrpc {

  private vehicleServiceGrpc() {}

  public static final String SERVICE_NAME = "vehicleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.VehicleService.VehicleInformationRequest,
      net.vbunova.grpc.VehicleService.VehicleInformationResponse> getGetVehicleInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicleInformation",
      requestType = net.vbunova.grpc.VehicleService.VehicleInformationRequest.class,
      responseType = net.vbunova.grpc.VehicleService.VehicleInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.VehicleService.VehicleInformationRequest,
      net.vbunova.grpc.VehicleService.VehicleInformationResponse> getGetVehicleInformationMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.VehicleService.VehicleInformationRequest, net.vbunova.grpc.VehicleService.VehicleInformationResponse> getGetVehicleInformationMethod;
    if ((getGetVehicleInformationMethod = vehicleServiceGrpc.getGetVehicleInformationMethod) == null) {
      synchronized (vehicleServiceGrpc.class) {
        if ((getGetVehicleInformationMethod = vehicleServiceGrpc.getGetVehicleInformationMethod) == null) {
          vehicleServiceGrpc.getGetVehicleInformationMethod = getGetVehicleInformationMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.VehicleService.VehicleInformationRequest, net.vbunova.grpc.VehicleService.VehicleInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "vehicleService", "getVehicleInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.VehicleService.VehicleInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.VehicleService.VehicleInformationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new vehicleServiceMethodDescriptorSupplier("getVehicleInformation"))
                  .build();
          }
        }
     }
     return getGetVehicleInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static vehicleServiceStub newStub(io.grpc.Channel channel) {
    return new vehicleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static vehicleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new vehicleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static vehicleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new vehicleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class vehicleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehicleInformation(net.vbunova.grpc.VehicleService.VehicleInformationRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.VehicleService.VehicleInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehicleInformationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehicleInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.vbunova.grpc.VehicleService.VehicleInformationRequest,
                net.vbunova.grpc.VehicleService.VehicleInformationResponse>(
                  this, METHODID_GET_VEHICLE_INFORMATION)))
          .build();
    }
  }

  /**
   */
  public static final class vehicleServiceStub extends io.grpc.stub.AbstractStub<vehicleServiceStub> {
    private vehicleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private vehicleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected vehicleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new vehicleServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVehicleInformation(net.vbunova.grpc.VehicleService.VehicleInformationRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.VehicleService.VehicleInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehicleInformationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class vehicleServiceBlockingStub extends io.grpc.stub.AbstractStub<vehicleServiceBlockingStub> {
    private vehicleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private vehicleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected vehicleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new vehicleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.vbunova.grpc.VehicleService.VehicleInformationResponse getVehicleInformation(net.vbunova.grpc.VehicleService.VehicleInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehicleInformationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class vehicleServiceFutureStub extends io.grpc.stub.AbstractStub<vehicleServiceFutureStub> {
    private vehicleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private vehicleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected vehicleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new vehicleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.vbunova.grpc.VehicleService.VehicleInformationResponse> getVehicleInformation(
        net.vbunova.grpc.VehicleService.VehicleInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehicleInformationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICLE_INFORMATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final vehicleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(vehicleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICLE_INFORMATION:
          serviceImpl.getVehicleInformation((net.vbunova.grpc.VehicleService.VehicleInformationRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.VehicleService.VehicleInformationResponse>) responseObserver);
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

  private static abstract class vehicleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    vehicleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.vbunova.grpc.VehicleService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("vehicleService");
    }
  }

  private static final class vehicleServiceFileDescriptorSupplier
      extends vehicleServiceBaseDescriptorSupplier {
    vehicleServiceFileDescriptorSupplier() {}
  }

  private static final class vehicleServiceMethodDescriptorSupplier
      extends vehicleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    vehicleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (vehicleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new vehicleServiceFileDescriptorSupplier())
              .addMethod(getGetVehicleInformationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
