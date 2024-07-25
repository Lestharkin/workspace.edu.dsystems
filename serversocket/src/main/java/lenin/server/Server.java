package lenin.server;

import java.net.ServerSocket;
import java.util.List;

public class Server implements SocketProcess{
  private ServerSocket serverSocket;

  public Server(ServerSocket serverSocket) {
    this.serverSocket = serverSocket;
  }

  @Override
  public boolean bind() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'bind'");
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
