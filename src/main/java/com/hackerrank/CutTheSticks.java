package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr.length);
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > min) {
                min = arr[i];
                System.out.println(arr.length - i);
            }
        }
    }
}
