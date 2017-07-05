package com.hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int score = in.nextInt();
            if (i == 0 || stack.peek() != score) {
                stack.push(score);
            }
        }

        int m = in.nextInt();
        int[] alice = new int[m];
        for (int i = 0; i < m; i++) {
            alice[i] = in.nextInt();

            while (!stack.empty() && stack.peek() <= alice[i]) {
                stack.pop();
            }
            System.out.println(stack.isEmpty() ? "1" : stack.size() + 1);
        }
    }
}
