package lenin.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server implements SocketProcess{
  ServerSocket serverSocket;
	Session session;

  public Server(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
		this.session = null;
	} 

  @Override
  public boolean bind() {
    try {
			Socket socket = this.serverSocket.accept();
			this.session = new Session(
					socket);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
  }

  @Override
  public List<Object> listen() {
  }

  @Override
  public boolean response(List<Object> data) {
  }

  @Override
  public boolean close() {
  }
  
}
