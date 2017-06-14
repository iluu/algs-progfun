package com.hackerrank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BiggerIsGreater {

    private static Scanner getScanner(String filePath) throws FileNotFoundException {
        File f = new File(filePath);
        return new Scanner(new FileInputStream(f));
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = getScanner("inputs/bigger-is-greater.txt");
        Scanner ans = getScanner("inputs/bigger-is-greater-answers.txt");
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = in.next();
            String answer = ans.nextLine();
            String myAnswer = nextPermutation(s);
            if (!myAnswer.equals(answer)) {
                System.out.println("\n" + i + ": \ninput: " + s);
                System.out.println(myAnswer);
                System.out.println(answer);
                count++;
            }
        }
        System.out.println("Wrong answers: " + count);
    }

    static String nextPermutation(String s) {
        int p = s.length() - 2;
        while (p >= 0 && s.charAt(p) >= s.charAt(p + 1)) {
            p--;
        }
        if (p < 0 || s.charAt(p) >= s.charAt(p + 1)) {
            return "no answer";
        }

        int q = s.length() - 1;
        while (s.charAt(q) <= s.charAt(p)) {
            q--;
        }

        char[] a = s.toCharArray();
        char temp = a[p];
        a[p] = a[q];
        a[q] = temp;

        String result = new String(a);
        StringBuilder reversed = new StringBuilder(result.substring(p + 1, result.length()));

        return result.substring(0, p + 1) + reversed.reverse().toString();
    }
}
