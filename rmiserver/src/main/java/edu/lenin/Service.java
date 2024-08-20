package edu.lenin;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Service extends UnicastRemoteObject implements RMIMSG {

  public Service() throws RemoteException {
    super();
  }

  public String sayHello(String msg) throws RemoteException {
    return "Hello, " + msg;
  }  
}
