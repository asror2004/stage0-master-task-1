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
        String str ;
        if (numberOfPaws == 1 ){
            str = "paw" ;
        }else{
            str = "paws" ;
        }

        System.out.println("This animal is mostly " + color + ". " +
                "It has " + numberOfPaws + " "+str+" and " + hasFur+" fur.");
    }
}
