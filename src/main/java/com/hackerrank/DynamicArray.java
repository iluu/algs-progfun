package com.hackerrank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

    List<Long>[] values;
    long lastAns;

    DynamicArray(int n) {
        this.values = new List[n];
        this.lastAns = 0;
    }

    DynamicArray(List[] values, int lastAns) {
        this.values = values;
        this.lastAns = lastAns;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(new File("inputs/dynamic-array.txt")));
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        DynamicArray dynamic = new DynamicArray(n);

        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            if (type == 1) {
                dynamic.executeType1Query(x, y);
            } else {
                System.out.println(dynamic.executeType2Query(x, y));
            }
        }
    }

    void executeType1Query(long x, long y) {
        int index = calculateSeqIndex(x);

        if (values[index] == null) {
            values[index] = new ArrayList<>();
        }
        values[index].add(y);
    }


    long executeType2Query(long x, long y) {
        int index = calculateSeqIndex(x);

        lastAns = values[index].get((int) (y % values[index].size()));
        return lastAns;
    }

    private int calculateSeqIndex(long x) {
        return (int) (x ^ lastAns) % values.length;
    }
}
