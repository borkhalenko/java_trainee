package com.borkhalenko.test_project;

public class SomeAssignableObject {
    private int number;

    public SomeAssignableObject(int number){
        this.number=number;
    }
    public int getNumber() {
        return number;
    }

    public SomeAssignableObject setNumber(int number) {
        return new SomeAssignableObject(number);
    }

    /*
    public void setNumber(int number){
        this.number=number;
    }*/

    @Override
    public String toString() {
        return "n=" + number;
    }

}
