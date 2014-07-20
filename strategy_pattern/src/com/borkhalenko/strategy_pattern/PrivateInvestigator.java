package com.borkhalenko.strategy_pattern;

public class PrivateInvestigator extends Employee{
    public PrivateInvestigator(){
        setStrategy(new DetectStrategy());
    }
    @Override
    public void introduce() {
        System.out.println("I'm private investigator.");
        System.out.println(doWork());
    }
}
