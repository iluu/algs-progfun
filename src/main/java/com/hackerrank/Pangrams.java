package com.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> letters = new HashSet<>();
        String line = sc.nextLine();

        for (Character c : line.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(Character.toLowerCase(c));
            }
        }

        System.out.println(letters.size() >= 26 ? "pangram" : "not pangram");
    }
}
