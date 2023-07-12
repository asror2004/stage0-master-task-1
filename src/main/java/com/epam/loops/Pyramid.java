package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
      int k = cathetusLength ;

        for (int i = 0; i < k; i++) {

            for (int j = 0; j < k - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i ; j >= 0; j--) {
                System.out.print(j + 1 );
            }
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(j + 1 );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
