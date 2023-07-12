package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int x = cathetusLength ;
       for(int i = 0 ; i < x ; i++){

           for (int j = 0; j < x - i - 1; j++) {
               System.out.print(" ");
           }
           for (int j = i ; j >= 0; j--) {
               System.out.print("*");
           }
           System.out.println();
           }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
