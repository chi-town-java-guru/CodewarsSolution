package com.codewars;

//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

import static java.util.Arrays.stream;

public class HighestAndLowest {

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5")); // return "5 1"
        System.out.println(highAndLow("1 2 -3 4 5"));// return "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5"));// return "9 -5"
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));// return "42 -9"
    }

    public static String highAndLow(String numbers) {
        return stream(numbers.split(" ")).map(Integer::parseInt).reduce(Integer::max).get() + " " +
                stream(numbers.split(" ")).map(Integer::parseInt).reduce(Integer::min).get();
    }
}
