package com.hackerrank;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeautifulPairs {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = readArray(in, n);
        int[] B = readArray(in, n);

        System.out.println(beautifulPairs(A, B));
    }

    static int beautifulPairs(int[] a, int[] b) {
        int pairs = 0;
        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && !visited[j]) {
                    pairs++;
                    visited[j] = true;
                    break;
                }
            }
        }
        return pairs == a.length ? pairs - 1 : pairs + 1;
    }

    private static int[] readArray(Scanner in, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

}
