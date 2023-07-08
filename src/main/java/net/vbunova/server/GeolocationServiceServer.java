package net.vbunova.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.vbunova.service.GeolocationService;
import net.vbunova.service.VehicleService;

import java.io.IOException;

public class GeolocationServiceServer {

    public static void main(String args[]) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(9093).addService(new GeolocationService()).build();

        server.start();

        System.out.println("Server started on " + server.getPort());

        server.awaitTermination();;
    }
}
