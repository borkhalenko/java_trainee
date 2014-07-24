package com.borkhalenko.rmi_sample.service;

import com.borkhalenko.rmi_sample.service.SimpleObjectInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SimpleObject implements SimpleObjectInterface {
    private String str;
    public SimpleObject() throws RemoteException{
        str="Server says, 'Hello, world'";
    }

    public String saySomething() {
        return str;
    }
}
