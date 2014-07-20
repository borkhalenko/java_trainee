package com.borkhalenko.strategy_pattern;

public class CEO extends Employee {
    public CEO(){
        setStrategy(new DirectStrategy());
    }
    @Override
    public void introduce() {
        System.out.println("I'm CEO.");
        System.out.println(doWork());
    }
}
