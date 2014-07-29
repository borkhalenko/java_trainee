package com.borkhalenko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ping {
    private String command="ping";
    private InetAddress address;
    private int count;
    private boolean isCurrentOsWindows;

    public enum ExitStatus {
        EXIT_OK(0),
        EXIT_UNKNOWN_HOST(1),
        EXIT_ERROR(2);
        private int status;
        private ExitStatus(int status){this.status=status;};
    }

    public Ping() throws UnknownHostException{
        command+=" "+"127.0.0.1";
        this.address=InetAddress.getByName(command);
        this.count=4;
        if (System.getProperty("os.name").startsWith("Windows")) {
            isCurrentOsWindows=true;
        } else {
            isCurrentOsWindows=false;
        }

    }

    public Ping(InetAddress address){
        this.address=address;
        command+=" "+address.getHostAddress();
        this.count=4;
        if (System.getProperty("os.name").startsWith("Windows")) {
            isCurrentOsWindows=true;
        } else {
            isCurrentOsWindows=false;
        }
    }

    public Ping(String str) throws UnknownHostException{
        command+=" "+str;
        address=InetAddress.getByName(str);
        this.count=4;
        if (System.getProperty("os.name").startsWith("Windows")) {
            isCurrentOsWindows=true;
        } else {
            isCurrentOsWindows=false;
        }
    }

    public boolean setCount(int c){
        if (c<1)
            return false;
        this.count=c;
        if (isCurrentOsWindows)
            this.command+=" "+"-n"+" "+c;
        else
            this.command+=" "+"-c"+" "+c;
        return true;
    }

    public int start(){
        try {
            String line;
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader bri = new BufferedReader
                    (new InputStreamReader(p.getInputStream()));
            BufferedReader bre = new BufferedReader
                    (new InputStreamReader(p.getErrorStream()));
            while ((line = bri.readLine()) != null) {
                System.out.println("Input: "+line);
            }
            bri.close();
            while ((line = bre.readLine()) != null) {
                System.out.println("Error: "+line);
            }
            bre.close();
            p.waitFor();
            return p.exitValue();

        }
        catch (IOException exception){
            //do something smart in feature
            exception.printStackTrace();
            return -1;
        }
        catch (InterruptedException exception){
            //do something smart in feature
            exception.printStackTrace();
            return -1;
        }
    }
}
