package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String input = in.next();
            System.out.println(countAnagrams(input));
        }
    }

    static int countAnagrams(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                result += count(input.substring(i, j), input.substring(i + 1, input.length()));
            }
        }
        return result;
    }

    private static int count(String value, String rest) {
        int count = 0;
        int[] pattern = pattern(value);
        for (int i = 0; i <= rest.length() - value.length(); i++) {
            String substring = rest.substring(i, i + value.length());
            if (Arrays.equals(pattern, pattern(substring))) {
                count++;
            }
        }
        return count;
    }

    private static int[] pattern(String value) {
        int[] pattern = new int[26];
        for (Character c : value.toCharArray()) {
            pattern[c - 'a']++;
        }
        return pattern;
    }
}
