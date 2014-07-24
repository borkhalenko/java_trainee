package com.borkhalenko.rmi_sample.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SimpleObjectInterface extends Remote { //Step 1: extends Remote
    public String saySomething() throws RemoteException; //Step 2: all methods must throws RemoteException
    //Step 3: arguments and return values must be primitives or Serializable
}
