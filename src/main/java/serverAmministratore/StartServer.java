package serverAmministratore;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.DefaultResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by civi on 26/04/16.
 */
public class StartServer {
    private static final String HOST = "localhost";
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://"+HOST+":"+PORT+"/");
        server.start();

        System.out.println("Server running!");
        System.out.println("Server started on: http://"+HOST+":"+PORT);

        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
        System.exit(0);
    }
}
