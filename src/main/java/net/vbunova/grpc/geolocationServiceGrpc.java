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
    comments = "Source: geolocationService.proto")
public final class geolocationServiceGrpc {

  private geolocationServiceGrpc() {}

  public static final String SERVICE_NAME = "geolocationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.LocationRequest,
      net.vbunova.grpc.GeolocationService.LocationRequestResponse> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLocation",
      requestType = net.vbunova.grpc.GeolocationService.LocationRequest.class,
      responseType = net.vbunova.grpc.GeolocationService.LocationRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.LocationRequest,
      net.vbunova.grpc.GeolocationService.LocationRequestResponse> getGetLocationMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.LocationRequest, net.vbunova.grpc.GeolocationService.LocationRequestResponse> getGetLocationMethod;
    if ((getGetLocationMethod = geolocationServiceGrpc.getGetLocationMethod) == null) {
      synchronized (geolocationServiceGrpc.class) {
        if ((getGetLocationMethod = geolocationServiceGrpc.getGetLocationMethod) == null) {
          geolocationServiceGrpc.getGetLocationMethod = getGetLocationMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.GeolocationService.LocationRequest, net.vbunova.grpc.GeolocationService.LocationRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "geolocationService", "getLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.GeolocationService.LocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.GeolocationService.LocationRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new geolocationServiceMethodDescriptorSupplier("getLocation"))
                  .build();
          }
        }
     }
     return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest,
      net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse> getGetNearbyVehiclesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNearbyVehicles",
      requestType = net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest.class,
      responseType = net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest,
      net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse> getGetNearbyVehiclesMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest, net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse> getGetNearbyVehiclesMethod;
    if ((getGetNearbyVehiclesMethod = geolocationServiceGrpc.getGetNearbyVehiclesMethod) == null) {
      synchronized (geolocationServiceGrpc.class) {
        if ((getGetNearbyVehiclesMethod = geolocationServiceGrpc.getGetNearbyVehiclesMethod) == null) {
          geolocationServiceGrpc.getGetNearbyVehiclesMethod = getGetNearbyVehiclesMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest, net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "geolocationService", "getNearbyVehicles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new geolocationServiceMethodDescriptorSupplier("getNearbyVehicles"))
                  .build();
          }
        }
     }
     return getGetNearbyVehiclesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteRequest,
      net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "shareSpeedAndRoute",
      requestType = net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteRequest.class,
      responseType = net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteRequest,
      net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteRequest, net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod;
    if ((getShareSpeedAndRouteMethod = geolocationServiceGrpc.getShareSpeedAndRouteMethod) == null) {
      synchronized (geolocationServiceGrpc.class) {
        if ((getShareSpeedAndRouteMethod = geolocationServiceGrpc.getShareSpeedAndRouteMethod) == null) {
          geolocationServiceGrpc.getShareSpeedAndRouteMethod = getShareSpeedAndRouteMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteRequest, net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "geolocationService", "shareSpeedAndRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new geolocationServiceMethodDescriptorSupplier("shareSpeedAndRoute"))
                  .build();
          }
        }
     }
     return getShareSpeedAndRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.SendChatMessageRequest,
      net.vbunova.grpc.GeolocationService.SendChatMessageResponse> getSendChatMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendChatMessage",
      requestType = net.vbunova.grpc.GeolocationService.SendChatMessageRequest.class,
      responseType = net.vbunova.grpc.GeolocationService.SendChatMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.SendChatMessageRequest,
      net.vbunova.grpc.GeolocationService.SendChatMessageResponse> getSendChatMessageMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.GeolocationService.SendChatMessageRequest, net.vbunova.grpc.GeolocationService.SendChatMessageResponse> getSendChatMessageMethod;
    if ((getSendChatMessageMethod = geolocationServiceGrpc.getSendChatMessageMethod) == null) {
      synchronized (geolocationServiceGrpc.class) {
        if ((getSendChatMessageMethod = geolocationServiceGrpc.getSendChatMessageMethod) == null) {
          geolocationServiceGrpc.getSendChatMessageMethod = getSendChatMessageMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.GeolocationService.SendChatMessageRequest, net.vbunova.grpc.GeolocationService.SendChatMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "geolocationService", "sendChatMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.GeolocationService.SendChatMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.GeolocationService.SendChatMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new geolocationServiceMethodDescriptorSupplier("sendChatMessage"))
                  .build();
          }
        }
     }
     return getSendChatMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static geolocationServiceStub newStub(io.grpc.Channel channel) {
    return new geolocationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static geolocationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new geolocationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static geolocationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new geolocationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class geolocationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLocation(net.vbunova.grpc.GeolocationService.LocationRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.LocationRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     */
    public void getNearbyVehicles(net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNearbyVehiclesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteRequest> shareSpeedAndRoute(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getShareSpeedAndRouteMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.SendChatMessageRequest> sendChatMessage(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.SendChatMessageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendChatMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.vbunova.grpc.GeolocationService.LocationRequest,
                net.vbunova.grpc.GeolocationService.LocationRequestResponse>(
                  this, METHODID_GET_LOCATION)))
          .addMethod(
            getGetNearbyVehiclesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest,
                net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse>(
                  this, METHODID_GET_NEARBY_VEHICLES)))
          .addMethod(
            getShareSpeedAndRouteMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteRequest,
                net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse>(
                  this, METHODID_SHARE_SPEED_AND_ROUTE)))
          .addMethod(
            getSendChatMessageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.GeolocationService.SendChatMessageRequest,
                net.vbunova.grpc.GeolocationService.SendChatMessageResponse>(
                  this, METHODID_SEND_CHAT_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class geolocationServiceStub extends io.grpc.stub.AbstractStub<geolocationServiceStub> {
    private geolocationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private geolocationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected geolocationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new geolocationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLocation(net.vbunova.grpc.GeolocationService.LocationRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.LocationRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNearbyVehicles(net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetNearbyVehiclesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteRequest> shareSpeedAndRoute(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getShareSpeedAndRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.SendChatMessageRequest> sendChatMessage(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.SendChatMessageResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendChatMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class geolocationServiceBlockingStub extends io.grpc.stub.AbstractStub<geolocationServiceBlockingStub> {
    private geolocationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private geolocationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected geolocationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new geolocationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.vbunova.grpc.GeolocationService.LocationRequestResponse getLocation(net.vbunova.grpc.GeolocationService.LocationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse> getNearbyVehicles(
        net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetNearbyVehiclesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class geolocationServiceFutureStub extends io.grpc.stub.AbstractStub<geolocationServiceFutureStub> {
    private geolocationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private geolocationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected geolocationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new geolocationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.vbunova.grpc.GeolocationService.LocationRequestResponse> getLocation(
        net.vbunova.grpc.GeolocationService.LocationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOCATION = 0;
  private static final int METHODID_GET_NEARBY_VEHICLES = 1;
  private static final int METHODID_SHARE_SPEED_AND_ROUTE = 2;
  private static final int METHODID_SEND_CHAT_MESSAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final geolocationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(geolocationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((net.vbunova.grpc.GeolocationService.LocationRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.LocationRequestResponse>) responseObserver);
          break;
        case METHODID_GET_NEARBY_VEHICLES:
          serviceImpl.getNearbyVehicles((net.vbunova.grpc.GeolocationService.NearbyVehiclesRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.NearbyVehiclesResponse>) responseObserver);
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
        case METHODID_SHARE_SPEED_AND_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.shareSpeedAndRoute(
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.ShareSpeedAndRouteResponse>) responseObserver);
        case METHODID_SEND_CHAT_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendChatMessage(
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.GeolocationService.SendChatMessageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class geolocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    geolocationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.vbunova.grpc.GeolocationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("geolocationService");
    }
  }

  private static final class geolocationServiceFileDescriptorSupplier
      extends geolocationServiceBaseDescriptorSupplier {
    geolocationServiceFileDescriptorSupplier() {}
  }

  private static final class geolocationServiceMethodDescriptorSupplier
      extends geolocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    geolocationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (geolocationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new geolocationServiceFileDescriptorSupplier())
              .addMethod(getGetLocationMethod())
              .addMethod(getGetNearbyVehiclesMethod())
              .addMethod(getShareSpeedAndRouteMethod())
              .addMethod(getSendChatMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
