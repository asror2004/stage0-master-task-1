package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public void   getDescription() {
     String str ;
    if(hasFur == true){
     str = "a" ;
    }else{
     str = "no" ;
    }
        if (numberOfPaws == 1 ){
            System.out.println("This animal is mostly " + color + ". " +
                    "It has " + numberOfPaws + " paw and " + str+" fur.");
        }else{
            System.out.println("This animal is mostly " + color + ". " +
                    "It has " + numberOfPaws + " paws and " + str+" fur.");
        }
    }
}
