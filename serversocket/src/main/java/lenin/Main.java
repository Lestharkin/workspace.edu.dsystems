package lenin;

import java.net.ServerSocket;
import java.util.ArrayList;

import lenin.java_server_socket.JavaServerSocket;
import lenin.server.Server;
import lenin.server.SocketProcess;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Java Server Socket");
        
        JavaServerSocket javaServerSocket = new JavaServerSocket(1802, 100);
        ServerSocket serverSocket = javaServerSocket.get();
        if (serverSocket == null) {
            System.out.println("ServerSocket is null");
            return;
        }

        SocketProcess server = new Server(serverSocket);

        


    }
}
