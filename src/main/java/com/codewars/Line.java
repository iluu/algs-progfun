package com.codewars;

public class Line {

    public static String Tickets(int[] peopleInLine) {
        int[] change = new int[3];
        for (int person : peopleInLine) {
            if (person == 25) {
                change[0] += 1;
            } else if (person == 50) {
                if (change[0] > 0) {
                    change[0] -= 1;
                    change[1] += 1;
                } else {
                    change[1] = -1;
                }
            } else {
                if (change[0] > 2) {
                    change[0] -= 3;
                    change[2] += 1;
                } else if (change[0] > 0 && change[1] > 0) {
                    change[0] -= 1;
                    change[1] -= 1;
                    change[2] += 1;
                } else {
                    change[2] = -1;
                }
            }
        }
        return change[0] > -1 && change[1] > -1 && change[2] > -1 ? "YES" : "NO";
    }
}
