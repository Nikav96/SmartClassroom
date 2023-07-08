package net.vbunova.service;

import io.grpc.stub.StreamObserver;
import net.vbunova.grpc.Vehicle;
import net.vbunova.grpc.vehicleGrpc;

public class VehicleService extends vehicleGrpc.vehicleImplBase {

    @Override
    public void getVehicleInformation(Vehicle.VehicleInformationRequest request, StreamObserver<Vehicle.VehicleInformationResponse> responseObserver) {

        Vehicle.VehicleInformationResponse.Builder response = Vehicle.VehicleInformationResponse.newBuilder()
                .setVehicleId(10)
                .setMetadata("BMW 530D RED");

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void shareSpeedAndRoute(Vehicle.ShareSpeedAndRouteRequest request, StreamObserver<Vehicle.ShareSpeedAndRouteResponse> responseObserver) {

        for (int i = 1; i <= 10; i++) {
            Vehicle.ShareSpeedAndRouteResponse response = Vehicle.ShareSpeedAndRouteResponse.newBuilder()
                    .setStatus(true)
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();

    }

    @Override
    public StreamObserver<Vehicle.NearbyVehiclesRequest> getNearbyVehicles(StreamObserver<Vehicle.NearbyVehiclesResponse> responseObserver) {


        return new StreamObserver<Vehicle.NearbyVehiclesRequest>() {

            int vehicleId = 0;
            @Override
            public void onNext(Vehicle.NearbyVehiclesRequest response) {
                vehicleId++;
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(Vehicle.NearbyVehiclesResponse.newBuilder()
                        .setVehicleId(vehicleId)
                        .build());

                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Vehicle.SendChatMessageRequest> sendChatMessage(StreamObserver<Vehicle.SendChatMessageResponse> responseObserver) {

        return new StreamObserver<Vehicle.SendChatMessageRequest>() {

            @Override
            public void onNext(Vehicle.SendChatMessageRequest sendChatMessageResponse) {
                for (int i = 1; i <= 5; i++) {
                    Vehicle.SendChatMessageResponse response = Vehicle.SendChatMessageResponse.newBuilder()
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
