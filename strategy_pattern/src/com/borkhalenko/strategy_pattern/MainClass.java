package com.borkhalenko.strategy_pattern;

public class MainClass {
    public static void main(String[] args){
        Employee[] employees={new CEO(),new Detective(),new Director(), new PrivateInvestigator()};
        for (Employee employee:employees){
            employee.introduce();
        }
    }
}
