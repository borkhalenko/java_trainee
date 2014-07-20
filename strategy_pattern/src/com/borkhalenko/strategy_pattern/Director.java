package com.borkhalenko.strategy_pattern;

public class Director extends Employee {
    public Director(){
        setStrategy(new DirectStrategy());
    }
    @Override
    public void introduce() {
        System.out.println("I'm Director.");
        System.out.println(doWork());
    }
}
