package org.example;

public class Main {

    static Integer firstValue = 12;
    static Integer secondValue = 40;
    static Integer thirdValue = 1234;
    static Integer fourthValue = -12;
    static Integer fifthValue = -1660000;

    public static void main(String[] args) {
        System.out.println(getReverseOfInt(firstValue));
        System.out.println(getReverseOfInt(secondValue));
        System.out.println(getReverseOfInt(thirdValue));
        System.out.println(getReverseOfInt(fourthValue));
        System.out.println(getReverseOfInt(fifthValue));
    }

    public static int getReverseOfInt(Integer originalInt) {
        int sizeOfTheOriginalInt = originalInt.toString().length();
        int reversed = 0;
        int divideByTen = 10;

        for (int i = 0; i < sizeOfTheOriginalInt; i++) {
            int lastDigit = originalInt % divideByTen;
            if (lastDigit != 0) {
                reversed = reversed * 10 + lastDigit;
            }
            originalInt = originalInt / 10;
        }
        return reversed;
    }
}