package net.vbunova.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.vbunova.service.VehicleService;

import java.io.IOException;

public class VehicleServiceServer {

    public static void main(String args[]) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(9091).addService(new VehicleService()).build();

        server.start();

        System.out.println("Server started on " + server.getPort());

        server.awaitTermination();;
    }
}
