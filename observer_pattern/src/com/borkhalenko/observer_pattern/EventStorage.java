package com.borkhalenko.observer_pattern;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

import java.util.*;

public class EventStorage {
    List<Integer> storage;

    public EventStorage(){
        storage=new ArrayList<Integer>();

    }
    public void add(int i){
        storage.add(i);
    }
    public void remove(int i){
        storage.remove(i);
    }

    public List<Integer> returnAll(){
        return storage;
        //return Storage;
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
