package com.epam.OOP;

public class Dog extends Animal {
  public Dog() {
        super("brown", 4, true);
    }
   @Override
    public void getDescription() {
        System.out.println(" This animal is mostly brown. " +
                "It has 4 paws and a fur.") ;
    }
}
