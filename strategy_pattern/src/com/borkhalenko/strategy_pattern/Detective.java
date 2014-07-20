package com.borkhalenko.strategy_pattern;

public class Detective extends Employee{
    public Detective(){
        setStrategy(new DetectStrategy());
    }
    @Override
    public void introduce() {
        System.out.println("I'm Detective.");
        System.out.println(doWork());
    }
}
