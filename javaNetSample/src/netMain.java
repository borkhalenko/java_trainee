import sun.nio.ch.Net;

import java.net.*;
import java.net.InetAddress;
import java.util.Enumeration;

public class netMain {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        InetAddress localIP = InetAddress.getLocalHost();
        printAllNetworkInterfaces();
        printInterfaceAddresses();
        printAllIpUsingInetAddress();
        System.out.println(localIP);
    }

    public static void printAllNetworkInterfaces() throws SocketException{
        System.out.println("Interfaces____________");
        Enumeration<NetworkInterface> interfaces=NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()){
            NetworkInterface i=interfaces.nextElement();
            System.out.println(i.toString());
        }
        System.out.println("Interfaces end____________");
    }

    public static void printAllIpUsingInetAddress() throws SocketException{
        System.out.println("IP using InterfaceAddresses____________");
        Enumeration<NetworkInterface> interfaces=NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()){
            NetworkInterface i=interfaces.nextElement();
            Enumeration<InetAddress> iaEnum=i.getInetAddresses();
            while (iaEnum.hasMoreElements()){
                InetAddress ia=iaEnum.nextElement();
                System.out.println(ia.getHostAddress()+" "+ia.getHostName());
            }
        }
        System.out.println("IP using InterfaceAddresses____________");
    }

    public static void printInterfaceAddresses() throws SocketException{
        System.out.println("Interface addresses____________");
        Enumeration<NetworkInterface> interfaces=NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()){
            NetworkInterface i=interfaces.nextElement();
            Enumeration<InetAddress> iaEnum=i.getInetAddresses();
            while (iaEnum.hasMoreElements()){
                InetAddress ia=iaEnum.nextElement();
                System.out.println(ia.toString());
            }
        }
        System.out.println("Interface addresses end____________");
    }
}
