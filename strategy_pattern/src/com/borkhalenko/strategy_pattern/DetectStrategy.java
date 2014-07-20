package com.borkhalenko.strategy_pattern;

public class DetectStrategy implements Strategy {

    @Override
    public String work() {
        return "I'm a detective, and I will detect!";
    }
}
