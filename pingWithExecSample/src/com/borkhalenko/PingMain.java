package com.borkhalenko;

import java.net.UnknownHostException;

public class PingMain {
    public static void main(String[] args) throws UnknownHostException{
        Ping pinger=new Ping("192.168.10.100");
        pinger.setCount(1);
        int status=pinger.start();
        System.out.println("Status: "+status);

    }
}
