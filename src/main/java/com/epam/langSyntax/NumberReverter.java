package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder reverseNumber = new StringBuilder(String.valueOf(number));
        System.out.println(reverseNumber.reverse());
    }

}
