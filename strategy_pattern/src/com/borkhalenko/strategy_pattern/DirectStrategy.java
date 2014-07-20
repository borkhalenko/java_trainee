package com.borkhalenko.strategy_pattern;

public class DirectStrategy implements Strategy {

    @Override
    public String work() {
        return "I'll control you, bitches!";
    }
}
