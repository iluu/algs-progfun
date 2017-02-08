package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SparseArrays {

    private final Map<String, Integer> dict;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            arr[i] = in.next();
        }

        SparseArrays finder = new SparseArrays(arr);
        count = in.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(finder.find(in.next()));
        }
    }

    SparseArrays(String[] arr) {
        dict = new HashMap<>(arr.length);
        for (String str : arr) {
            int val = dict.containsKey(str) ? dict.get(str) : 0;
            dict.put(str, val + 1);
        }
    }

    int find(String query) {
        return dict.containsKey(query) ? dict.get(query) : 0;
    }
}
