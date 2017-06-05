package com.other;

import java.util.Arrays;
import java.util.Comparator;

public class CompareMe implements Comparable<CompareMe> {

    private int value;

    private CompareMe(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(CompareMe that) {
        if (this == that) return 0;
        if (this.value > that.value) return 1;
        if (this.value < that.value) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static void main(String[] args) {
        CompareMe v1 = new CompareMe(1);
        CompareMe v2 = new CompareMe(2);
        CompareMe v3 = new CompareMe(3);

        CompareMe[] arr = new CompareMe[]{v2, v1, v3};
        Arrays.sort(arr, descending);

        for (CompareMe compareMe : arr) {
            System.out.println(compareMe);
        }
    }

    private static Comparator<CompareMe> descending = (o1, o2) -> {
        if (o1 == o2) return 0;
        if (o1.value > o2.value) return -1;
        if (o1.value < o2.value) return 1;
        return 0;
    };
}
