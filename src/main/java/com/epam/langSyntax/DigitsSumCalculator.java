package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int a1 = number % 10;
        int a2 = number / 10 % 10 ;
        int a3 = number /100 % 10 ;
        int a4 = number /1000 / 10 ;
        int sum = a1 + a2 + a3 + a4;
        System.out.println(sum);
    }

}
