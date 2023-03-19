package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder value = new StringBuilder(String.valueOf(number));
        value.reverse();
        System.out.println(Integer.valueOf(value.toString()));
    }

}
