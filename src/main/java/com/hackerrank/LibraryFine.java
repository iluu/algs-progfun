package com.hackerrank;

import java.util.Calendar;
import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();

        System.out.println(calculateFine(d1, m1, y1, d2, m2, y2));
    }

    static int calculateFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        final Calendar c1 = Calendar.getInstance();
        final Calendar c2 = Calendar.getInstance();

        c1.set(y1, m1, d1);
        c2.set(y2, m2, d2);

        if (c1.compareTo(c2) <= 0) {
            return 0;
        } else if (y1 > y2) {
            return 10000;
        } else if (m1 > m2) {
            return 500 * (m1 - m2);
        } else {
            return 15 * (d1 - d2);
        }
    }

}
