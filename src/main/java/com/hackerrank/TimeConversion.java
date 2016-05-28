package com.hackerrank;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        System.out.println(convert(time));
    }

    static String convert(String time) {
        final String hour = time.split(":")[0];
        final int intHour = Integer.parseInt(hour);

        if (time.contains("PM") && intHour < 12) {
            time = time.replace(hour, intHour + 12 + "");
        } else if (time.contains("AM") && intHour == 12) {
            time = time.replace(hour, "00");
        }
        return time.substring(0, time.length() - 2);
    }
}