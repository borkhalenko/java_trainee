package com.borkhalenko.test_project;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args){
        Storage storage=new Storage();
        System.out.println(storage);
        List<SomeAssignableObject> list=storage.getList();
        list.get(0).setNumber(200);
        System.out.println(list);
        System.out.println(storage);
    }
}
