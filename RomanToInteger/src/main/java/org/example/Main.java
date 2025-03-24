package org.example;

import java.util.HashMap;

public class Main {

    static final String ONE = "I";
    static final String FIVE = "V";
    static final String TEN = "X";
    static final String FIFTY = "L";
    static final String ONE_HUNDRED = "C";
    static final String FIVE_HUNDRED = "D";
    static final String ONE_THOUSAND = "M";

    static final HashMap<String, Integer> STRING_INTEGER_HASH_MAP = new HashMap<>() {{{
        put(ONE, 1);
        put(FIVE, 5);
        put(TEN, 10);
        put(FIFTY, 50);
        put(ONE_HUNDRED, 100);
        put(FIVE_HUNDRED, 500);
        put(ONE_THOUSAND, 1000);
    }}};

    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println(getIntegerFromRoman("II"));
        System.out.println(getIntegerFromRoman("III"));
        System.out.println(getIntegerFromRoman("IV"));
        System.out.println(getIntegerFromRoman("LVIII"));
        System.out.println(getIntegerFromRoman("MCMXCIV"));
        System.out.println(getIntegerFromRoman("CMXCVIII"));
    }

    public static Integer getIntegerFromRoman(String roman) {
        int finalResult = 0;
        char[] charArray = roman.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            char nextChar;

            if (i != charArray.length - 1) {
                nextChar = charArray[i + 1];
            } else {
                nextChar = currentChar;
            }

            int currentNumberOfChar = STRING_INTEGER_HASH_MAP.getOrDefault(String.valueOf(currentChar), 0);
            int nextNumberOfChar = STRING_INTEGER_HASH_MAP.getOrDefault(String.valueOf(nextChar), 0);
            finalResult = (currentNumberOfChar < nextNumberOfChar) ? finalResult - currentNumberOfChar : finalResult + currentNumberOfChar;
        }

        return finalResult;
    }

}