package net.vbunova.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.vbunova.service.StreetLightService;

import java.io.IOException;

public class StreetLightServiceServer {

    public static void main(String args[]) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(9092).addService(new StreetLightService()).build();

        server.start();

        System.out.println("Server started on " + server.getPort());

        server.awaitTermination();;
    }
}
