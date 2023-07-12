package com.epam.OOP;

public class Animal {
 String color;
    int numberOfPaws;
    boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public void   getDescription() {
        if (numberOfPaws == 1 ){
            System.out.println("This animal is mostly " + color + ". " +
                    "It has " + numberOfPaws + " paw and " + hasFur+" fur.");
        }else{
            System.out.println("This animal is mostly " + color + ". " +
                    "It has " + numberOfPaws + " paws and " + hasFur+" fur.");
        }
    }
}
