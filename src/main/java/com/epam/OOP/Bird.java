package com.epam.OOP;

public class Bird {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public void getDescription() {
        System.out.println(" This animal is mostly blue. " +
                "It has 2 paws and no fur. Moreover, it has 2 wings and can fly.") ;
    }
}
