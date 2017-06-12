package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheTimeInWords {

    private static Map<Integer, String> values = initHashMap();

    private static Map<Integer, String> initHashMap() {
        Map<Integer, String> values = new HashMap<>();
        values.put(1, "one");
        values.put(2, "two");
        values.put(3, "three");
        values.put(4, "four");
        values.put(5, "five");
        values.put(6, "six");
        values.put(7, "seven");
        values.put(8, "eight");
        values.put(9, "nine");
        values.put(10, "ten");
        values.put(11, "eleven");
        values.put(12, "twelve");
        values.put(13, "thirteen");
        values.put(14, "fourteen");
        values.put(15, "quarter");
        values.put(16, "sixteen");
        values.put(17, "seventeen");
        values.put(18, "eighteen");
        values.put(19, "nineteen");
        values.put(20, "twenty");
        values.put(21, "twenty one");
        values.put(22, "twenty two");
        values.put(23, "twenty three");
        values.put(24, "twenty four");
        values.put(25, "twenty five");
        values.put(26, "twenty six");
        values.put(27, "twenty seven");
        values.put(28, "twenty eight");
        values.put(29, "twenty nine");
        values.put(30, "half");
        return values;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int minutes = in.nextInt();

        System.out.println(time(hour, minutes));
    }

    static String time(int hour, int minutes) {
        if (minutes == 0) {
            return values.get(hour) + " o' clock";
        }

        if (minutes <= 30) {
            return values.get(minutes) +
                    ((minutes % 15 != 0) ? " minutes" : "") + " past " +
                    values.get(hour);
        } else {
            return values.get(60 - minutes) +
                    ((minutes % 15 != 0) ? " minutes" : "") + " to " +
                    values.get(hour + 1);
        }
    }
}
