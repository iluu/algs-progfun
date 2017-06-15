package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndTheValidString {

    static String isValid(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (!dict.containsKey(c)) {
                dict.put(c, 0);
            }
            dict.put(c, dict.get(c) + 1);
        }

        int err = 0;
        int val = dict.get(s.charAt(0));
        for (Integer v : dict.values()) {
            int abs = Math.abs(v - val);
            if (abs == 1 || v == 1) {
                err++;
            }
            if (err > 1 || abs > 1 && v > 1) {
                return "NO";
            }

        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }

}
