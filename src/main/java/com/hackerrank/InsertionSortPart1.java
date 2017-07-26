package com.hackerrank;

import java.util.Scanner;

public class InsertionSortPart1 {

    private static void insertIntoSorted(int[] ar) {
        int number = ar[ar.length - 1];
        int i;
        for (i = ar.length - 2; i >= 0 && ar[i] > number; i--) {
            ar[i + 1] = ar[i];
            printArray(ar);
        }
        ar[i + 1] = number;
        printArray(ar);
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
