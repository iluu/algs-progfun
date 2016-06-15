package com.hackerrank;

import java.util.Scanner;

public class CavityMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for (int grid_i = 0; grid_i < n; grid_i++) {
            grid[grid_i] = in.next();
        }

        calculateCavities(grid, n);
    }

    static String[] calculateCavities(String[] grid, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                result[i] = grid[i];
            } else {
                result[i] = replaceCavity(grid, i);
            }
        }
        return result;
    }

    private static String replaceCavity(String[] grid, int idx) {
        for (int i = 1; i < grid.length - 1; i++) {
            int cur = grid[idx].charAt(i);
            if (grid[idx - 1].charAt(i) < cur &&
                    grid[idx + 1].charAt(i) < cur &&
                    grid[idx].charAt(i - 1) < cur &&
                    grid[idx].charAt(i + 1) < cur) {
                char[] chars = grid[idx].toCharArray();
                chars[i] = 'X';
                grid[idx] = new String(chars);
            }
        }
        return grid[idx];
    }
}
