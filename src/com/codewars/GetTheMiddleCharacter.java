package com.codewars;

//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

public class GetTheMiddleCharacter {

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));//should return "es"

        System.out.println(getMiddle("testing"));//should return "t"

        System.out.println(getMiddle("miadlew"));//should return "dd"

        System.out.println(getMiddle("A"));//should return "A"
    }


    public static String getMiddle(String word) {
        int len = word.length();
        return word.substring(len / 2 - (len % 2 == 0 ? 1 : 0), len / 2 + 1);
    }
}
