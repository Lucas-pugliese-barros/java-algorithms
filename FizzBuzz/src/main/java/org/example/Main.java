package org.example;

import java.util.ArrayList;

public class Main {

    static int n = 0;
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        n = firstSeed();
        fizzBuzz(n, list);

        list.clear();

        n = secondSeed();
        fizzBuzz(n, list);

        list.clear();

        n = thirdSeed();
        fizzBuzz(n, list);
    }

    public static void fizzBuzz(int n, ArrayList<String> list) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }
        System.out.println(list);
    }

    public static int firstSeed() {
        return 3;
    }

    public static int secondSeed() {
        return 5;
    }

    public static int thirdSeed() {
        return 15;
    }
}