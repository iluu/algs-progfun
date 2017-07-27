package com.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LonelyInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();
            if (numbers.contains(c)) {
                numbers.remove(c);
            } else {
                numbers.add(c);
            }
        }
        System.out.println(numbers.iterator().next());
    }
}
