package net.vbunova.service;

import io.grpc.stub.StreamObserver;
import net.vbunova.grpc.Geolocation;
import net.vbunova.grpc.geolocationGrpc;

public class GeolocationService extends geolocationGrpc.geolocationImplBase {

    @Override
    public void getLocation(Geolocation.LocationRequest request, StreamObserver<Geolocation.LocationRequestResponse> responseObserver) {
        Geolocation.LocationRequestResponse.Builder response = Geolocation.LocationRequestResponse.newBuilder()
                .setLocationId(5524);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getNearbyVehicles(Geolocation.NearbyVehiclesRequest request, StreamObserver<Geolocation.NearbyVehiclesResponse> responseObserver) {
        for (int i = 1; i <= 10; i++) {
            Geolocation.NearbyVehiclesResponse response = Geolocation.NearbyVehiclesResponse.newBuilder()
                    .setVehicleId(15)
                    .setLat("2")
                    .setLon("2")
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Geolocation.ShareSpeedAndRouteRequest> shareSpeedAndRoute(StreamObserver<Geolocation.ShareSpeedAndRouteResponse> responseObserver) {
        return new StreamObserver<Geolocation.ShareSpeedAndRouteRequest>() {
            @Override
            public void onNext(Geolocation.ShareSpeedAndRouteRequest response) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(Geolocation.ShareSpeedAndRouteResponse.newBuilder()
                        .setStatus(true)
                        .build());

                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Geolocation.SendChatMessageRequest> sendChatMessage(StreamObserver<Geolocation.SendChatMessageResponse> responseObserver) {
        return new StreamObserver<Geolocation.SendChatMessageRequest>() {

            @Override
            public void onNext(Geolocation.SendChatMessageRequest sendChatMessageResponse) {
                for (int i = 1; i <= 5; i++) {
                    Geolocation.SendChatMessageResponse response = Geolocation.SendChatMessageResponse.newBuilder()
                            .setMessage("This is some chat message...")
                            .build();
                    responseObserver.onNext(response);
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

    }
}
