package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class EqualityInArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int previousMaxCount = 0;
        int maxCount = 1;
        Arrays.sort(arr);
        int current = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == current) {
                maxCount++;
            } else {
                if (previousMaxCount < maxCount) {
                    previousMaxCount = maxCount;
                }
                current = arr[i];
                maxCount = 1;
            }
        }
        int result = previousMaxCount > maxCount ? n - previousMaxCount : n - maxCount;
        System.out.println(result);
    }

}
