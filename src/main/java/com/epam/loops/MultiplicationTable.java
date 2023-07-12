package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint <= 0){
            System.out.println("Please enter positive number");
        }else {
            for (int i = 1 ; i <= 9 ; i++){
                System.out.println( i + " * " + numberTableToPrint + " = "
                        +  (numberTableToPrint * i ) );
            }
        }
    }

}
