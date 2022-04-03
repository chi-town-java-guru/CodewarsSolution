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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class People {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/home/guru/Downloads/sql/people.csv"));
        Map<String, Integer> stateMap = new HashMap<>();
        Map<String, Double> stateAgeMap = new HashMap<>();
        sc.next();
        while (sc.hasNext()) {
            String next = sc.next();
            String state = next.split(",")[2];
            Double age = Double.valueOf(next.split(",")[1]);

            stateMap.put(state, stateMap.containsKey(state) ? stateMap.get(state) + 1 : 1);
            stateAgeMap.put(state, stateAgeMap.containsKey(state) ? stateAgeMap.get(state) + age : age);
        }
        Stream<Map.Entry<String, Integer>> stringSt = stateMap.entrySet().stream();
        stringSt.sorted(Comparator.comparing(a -> Math.round(stateAgeMap.get(a.getKey()) / a.getValue()))).forEach(s -> System.out.println(s.getKey() + "=" + Math.round(stateAgeMap.get(s.getKey()) / s.getValue())));
        //  System.out.println(stateMap);

    }
}

