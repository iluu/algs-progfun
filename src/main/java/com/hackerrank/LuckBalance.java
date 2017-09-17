package com.hackerrank;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LuckBalance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int maxLuck = 0;
        for (int i = 0; i < n; i++) {
            int li = in.nextInt();
            int ti = in.nextInt();
            if (ti == 1) {
                queue.add(li);
            }
            maxLuck += li;
        }
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            maxLuck -= 2 * queue.remove();
        }

        System.out.println(maxLuck);
    }
}
