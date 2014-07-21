package com.borkhalenko.observer_pattern;

import org.joda.time.DateTime;

import java.util.List;

public class MainClass {
    public static void main(String[] args){
        EventStorage storage=new EventStorage();
        storage.add(1);
        storage.add(2);
        storage.add(3);
        storage.add(4);
        storage.add(5);
        System.out.println(storage);
        List<Integer> list=storage.returnAll();
        int i=list.get(2);
        i=100;
        System.out.println(storage);
    }
}
