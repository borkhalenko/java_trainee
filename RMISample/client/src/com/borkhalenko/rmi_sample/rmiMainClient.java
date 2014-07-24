package com.borkhalenko.rmi_sample;

import com.borkhalenko.rmi_sample.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.rmi.RemoteException;

public class rmiMainClient {
    public static void main(String[] args) throws RemoteException{
        ApplicationContext clientContext=new ClassPathXmlApplicationContext("clientApplicationContext.xml");
        SimpleObjectInterface simpleObject=(SimpleObjectInterface) clientContext.getBean("simpleObject");
        System.out.println(simpleObject.saySomething());
    }
}
