package com.codewars;

//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

import static java.lang.String.valueOf;

public class GetTheMiddleCharacter {

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));//should return "es"

        System.out.println(getMiddle("testing"));//should return "t"

        System.out.println(getMiddle("middlew"));//should return "dd"

        System.out.println(getMiddle("A"));//should return "A"
    }


    public static String getMiddle(String word) {
        int len = word.length();
        return len == 1 ? word :
                len % 2 == 0 ? valueOf(word.charAt(len / 2) - 1 + word.charAt(len / 2)) :
                        valueOf(word.charAt(len / 2) - 1);
    }
}
