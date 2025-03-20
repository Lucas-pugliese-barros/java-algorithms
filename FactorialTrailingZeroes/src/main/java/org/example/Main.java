package org.example;

public class Main {

    static int firstValue = 125;
    static int secondValue = 25;
    static int thirdValue = 3;

    public static void main(String[] args) {
        System.out.println(getTrailingZeroes(firstValue));
        System.out.println(getTrailingZeroes(secondValue));
        System.out.println(getTrailingZeroes(thirdValue));
    }

    public static int getTrailingZeroes(int value) {
        int count = 0;
        int currPowerOfFive = 5;
        while(value >= currPowerOfFive) {
            count += (value / currPowerOfFive);
            currPowerOfFive = currPowerOfFive * 5;
        }
        return count;
    }
}