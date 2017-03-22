package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MelodiousPassword {

    private static char[] vowels = new char[]{
            'a', 'e', 'i', 'o', 'u'
    };
    private static char[] consonants = new char[]{
            'w', 't', 'v', 'g', 'l', 'h', 'x', 'q', 'j', 'r', 'k', 'p', 'm', 'd', 'z', 'c', 'n', 'b', 'f', 's'
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<StringBuilder> result = new ArrayList<>();
        for (char vowel : vowels) {
            result.add(new StringBuilder().append(vowel));
        }
        for (char consonant : consonants) {
            result.add(new StringBuilder().append(consonant));
        }

        for (int i = 1; i < n; i++) {
            List<StringBuilder> temp = new ArrayList<>();
            for (StringBuilder sb : result) {
                if (isVowel(sb, i - 1)) {
                    for (int j = 1; j < consonants.length; j++) {
                        temp.add(new StringBuilder(sb.toString()).append(consonants[j]));
                    }
                    temp.add(sb.append(consonants[0]));
                } else {
                    for (int j = 1; j < vowels.length; j++) {
                        temp.add(new StringBuilder(sb.toString()).append(vowels[j]));
                    }
                    temp.add(sb.append(vowels[0]));
                }
            }
            result = temp;
        }
        for (StringBuilder sb : result) {
            System.out.println(sb.toString());
        }
    }

    private static boolean isVowel(StringBuilder sb, int idx) {
        for (char vowel : vowels) {
            if (sb.charAt(idx) == vowel) {
                return true;
            }
        }
        return false;
    }


}
