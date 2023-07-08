package net.vbunova.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.vbunova.service.GeolocationService;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;

public class GeolocationServiceServer {

    private static class SampleListener implements ServiceListener {
        @Override
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        @Override
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        @Override
        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
        }
    }

    public static void main(String args[]) throws InterruptedException {

        try {

            Server server = ServerBuilder.forPort(9093).addService(new GeolocationService()).build();

            server.start();

            System.out.println("Server started on " + server.getPort());
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "www.vbunova.net/geolocation", 9093, "path=/");
            jmdns.registerService(serviceInfo);

            // Add a service listener
            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());

            server.awaitTermination();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
