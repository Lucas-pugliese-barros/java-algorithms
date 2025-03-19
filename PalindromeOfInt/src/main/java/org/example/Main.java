package org.example;

import java.time.LocalDateTime;

public class Main {

    static int firstNumber = 10;
    static int secondNumber = -10;
    static int thirdNumber = 11;
    static int forthNumber = 1111221111;

    public static void main(String[] args) {
        LocalDateTime before;
        LocalDateTime after;

        before = LocalDateTime.now();
        System.out.println(isPalindromeCheckingByString(secondNumber));
        System.out.println(isPalindromeCheckingByString(firstNumber));
        System.out.println(isPalindromeCheckingByString(thirdNumber));
        System.out.println(isPalindromeCheckingByString(forthNumber));
        after = LocalDateTime.now();

        System.out.println("First execution: " + (after.getNano() - before.getNano()));

        System.out.println("\n");

        before = LocalDateTime.now();
        System.out.println(isPalindromeCheckingByInt(firstNumber));
        System.out.println(isPalindromeCheckingByInt(secondNumber));
        System.out.println(isPalindromeCheckingByInt(thirdNumber));
        System.out.println(isPalindromeCheckingByInt(forthNumber));
        after = LocalDateTime.now();

        System.out.println("Second execution: " + (after.getNano() - before.getNano()));
    }

    public static boolean isPalindromeCheckingByString(int number) {
        String numberAsString = String.valueOf(number);
        String numberAsStringReverse = new StringBuilder(numberAsString).reverse().toString();
        return numberAsString.equals(numberAsStringReverse);
    }

    public static boolean isPalindromeCheckingByInt(int number) {
        if (number < 0)
            return false;
        if (number != 0 && number % 10 == 0)
            return false;

        int reverseNumber = 0;
        while (number > reverseNumber) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number = number / 10;
        }

        return (number == reverseNumber) || (number == (reverseNumber / 10));
    }

}