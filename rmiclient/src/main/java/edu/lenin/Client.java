package edu.lenin;

public class Client {

  private String url;

  public Client(String ip, String port, String serviceName) {
    this.uri = "rmi://" + ip + ":" + port + "/" + serviceName;
  }

  public String sayHello(String msg) {
    try {
      RMIMSG service = (RMIMSG) Naming.lookup(url);
      return service.sayHello(msg);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  
}
