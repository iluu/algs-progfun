package com.hackerrank;

import java.util.Scanner;

public class SherlockAndArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            System.out.println(findIndex(arr));
        }
    }

    static String findIndex(int[] arr) {
        long sum = 0;
        for (int anArr : arr) {
            sum += anArr;
        }

        long rightSum = 0;
        long leftSum = 0;
        for (int i = 1; i < arr.length; i++) {
            leftSum += arr[i - 1];
            rightSum = sum - (leftSum + arr[i]);
            if (leftSum == rightSum) {
                return "YES";
            }
        }
        return leftSum == rightSum ? "YES" : "NO";
    }

}
