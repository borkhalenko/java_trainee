package com.borkhalenko.rmi_sample.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.rmi.RemoteException;
import java.util.logging.Logger;

public class rmiMainServer {
    public static final Logger logger=Logger.getAnonymousLogger();
    public static void main(String[] args) throws RemoteException{
        ApplicationContext serverContext=new ClassPathXmlApplicationContext("serverApplicationContext.xml");
        logger.info("Service started");
    }
}
