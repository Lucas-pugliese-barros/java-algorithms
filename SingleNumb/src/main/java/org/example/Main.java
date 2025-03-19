package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    //   0101  (5)
    //^  0101  (5)
    //--------
    //   0000  (0)

    static ArrayList<Integer> firstList = new ArrayList<>() {{
        add(2);
        add(2);
        add(33);
        add(33);
        add(22);
        add(1);
        add(1);
    }};

    public static void main(String[] args) {


        System.out.println(getSingleNumb(firstList));
        System.out.println(getSingleNumbBitWise(firstList));
    }

    public static Integer getSingleNumb(ArrayList<Integer> list) {
        ArrayList<Integer> finalList = new ArrayList<>();

        if (list.size() == 1)
            return list.get(0);

        for (Integer integer : list) {
            if (!finalList.contains(integer)) {
                finalList.add(integer);
            } else {
                finalList.remove(integer);
            }
        }
        return finalList.get(0);
    }

    public static int getSingleNumbBitWise(ArrayList<Integer> list) {
        int singleNum = 0;
        for (int num : list) {
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }
}
