package lenin.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Server implements SocketProcess{
  private ServerSocket serverSocket;
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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listen'");
  }

  @Override
  public boolean response(List<Object> data) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'response'");
  }

  @Override
  public boolean close() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'close'");
  }
  
}
