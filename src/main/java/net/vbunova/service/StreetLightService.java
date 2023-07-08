package net.vbunova.service;

import io.grpc.stub.StreamObserver;
import net.vbunova.grpc.StreetLight;
import net.vbunova.grpc.streetLightGrpc;

public class StreetLightService extends streetLightGrpc.streetLightImplBase {

    @Override
    public void activateLights(StreetLight.ActivateLightsRequest request, StreamObserver<StreetLight.ActivateLightsResponse> responseObserver) {

        StreetLight.ActivateLightsResponse.Builder response = StreetLight.ActivateLightsResponse.newBuilder()
                .setStatus(true);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getLightsRealtimeMap(StreetLight.LightsRealtimeMapRequest request, StreamObserver<StreetLight.LightsRealtimeMapResponse> responseObserver) {

        int lat = 0;
        int lon = 0;

        for (int i = 1; i <= 10; i++) {
            StreetLight.LightsRealtimeMapResponse response = StreetLight.LightsRealtimeMapResponse.newBuilder()
                    .setLat(""+lat++)
                    .setLon(""+lon++)
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<StreetLight.ShareSpeedAndRouteRequest> shareSpeedAndRoute(StreamObserver<StreetLight.ShareSpeedAndRouteResponse> responseObserver) {
        return new StreamObserver<StreetLight.ShareSpeedAndRouteRequest>() {

            int vehicleId = 0;
            @Override
            public void onNext(StreetLight.ShareSpeedAndRouteRequest response) {
                vehicleId++;
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(StreetLight.ShareSpeedAndRouteResponse.newBuilder()
                        .setStatus(true)
                        .build());

                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<StreetLight.SendChatMessageRequest> sendChatMessage(StreamObserver<StreetLight.SendChatMessageResponse> responseObserver) {
        return new StreamObserver<StreetLight.SendChatMessageRequest>() {

            @Override
            public void onNext(StreetLight.SendChatMessageRequest sendChatMessageRequest) {
                for (int i = 1; i <= 5; i++) {
                    StreetLight.SendChatMessageResponse response = StreetLight.SendChatMessageResponse.newBuilder()
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
