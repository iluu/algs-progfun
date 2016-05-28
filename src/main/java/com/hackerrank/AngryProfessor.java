package com.hackerrank;

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int sample = 0; sample < testCases; sample++) {

            int students = in.nextInt();
            int threshold = in.nextInt();
            int arrivals[] = new int[students];
            for (int arr = 0; arr < students; arr++) {
                arrivals[arr] = in.nextInt();
            }

            System.out.println(isClassCancelled(threshold, arrivals));
        }
    }

    static String isClassCancelled(int threshold, int[] arrivals) {
        int onTime = 0;
        for (int arrival : arrivals) {
            if (arrival <= 0) {
                onTime++;
            }
            if (onTime >= threshold) {
                return "NO";
            }
        }
        return "YES";
    }


}
