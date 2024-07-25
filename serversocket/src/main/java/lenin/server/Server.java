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
