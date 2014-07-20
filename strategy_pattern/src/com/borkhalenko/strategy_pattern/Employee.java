package com.borkhalenko.strategy_pattern;

public abstract class Employee {
    Strategy strategy;

    protected void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }

    protected final String doWork(){
        return strategy.work();
    };

    public abstract void introduce();
}
