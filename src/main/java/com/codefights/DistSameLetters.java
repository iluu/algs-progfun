package com.codefights;

class DistSameLetters {

    String distSameLetter(String s) {
        int max = 0;
        char c = 0;

        for (int j = 0; j < s.length() - 1; j++) {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(j) == s.charAt(i)) {
                    if (i - j > max) {
                        max = i - j + 1;
                        c = s.charAt(i);
                    }
                }
            }
        }
        return c + "" + max;
    }
}
