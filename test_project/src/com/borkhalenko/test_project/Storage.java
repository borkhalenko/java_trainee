package com.borkhalenko.test_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Storage {
    private ArrayList<SomeAssignableObject> list;
    public Storage(){
        list=new ArrayList<SomeAssignableObject>();
        list.add(new SomeAssignableObject(1));
        list.add(new SomeAssignableObject(2));
        list.add(new SomeAssignableObject(3));
        list.add(new SomeAssignableObject(4));
        list.add(new SomeAssignableObject(5));
    }

    public List<SomeAssignableObject> getList(){

        return new ArrayList<SomeAssignableObject>(list);
    }
    @Override
    public String toString() {
        return list.toString();
    }
}
