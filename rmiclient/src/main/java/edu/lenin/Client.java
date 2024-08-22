package edu.lenin;

import java.rmi.Naming;

public class Client {

  private String url;

  public Client(String ip, String port, String serviceName) {
    this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
  }

  public String sayHello(String msg) {
    try {
      RMIMSG service = (RMIMSG) Naming.lookup(this.url);
      return service.sayHello(msg);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  
}
