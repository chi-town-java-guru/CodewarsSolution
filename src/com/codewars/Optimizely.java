/**
 * FizzBuzz
 * <p>
 * The task is to print out the numbers 1 through 100, except in the following cases:
 * <p>
 * 1. If the number is divisible by 3, print Fizz
 * <p>
 * 2. If the number is divisible by 5, print Buzz
 * <p>
 * 3. If the number is divisible by 3 and 5, print FizzBuzz
 */

package com.codewars;

import java.util.Arrays;

public class Optimizely {

    public static void main(String[] args) {
        String[] output = new String[100];

        for (int i = 1; i < 101; i++) {
            output[i - 1] = String.valueOf(i);
        }
        for (int i = 3; i < 101; i += 3) {
            output[i - 1] = "Fizz";
        }
        for (int i = 5; i < 101; i += 5) {
            output[i - 1] = "Buzz";
        }
        for (int i = 15; i < 101; i += 15) {
            output[i - 1] = "FizzBuzz";
        }
        Arrays.stream(output).forEach(System.out::println);
    }
}


