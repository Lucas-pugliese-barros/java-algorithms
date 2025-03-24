package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(intToRoman(10));
        System.out.println(intToRoman(90));
        System.out.println(intToRoman(103));
        System.out.println(intToRoman(101));
    }

    public static String intToRoman(int num) {
        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumeral = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romanSymbol = "";

        for (int i = 0; i < storeInt.length; i++) {
            while (num >= storeInt[i]) {
                romanSymbol += romanNumeral[i];
                num -= storeInt[i];
            }
        }

        return romanSymbol;
    }
}