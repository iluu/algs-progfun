package com.hackerrank;

import java.util.LinkedList;
import java.util.Scanner;

public class AlgorithmicCrush {

    private int maxValue;
    private LinkedList<Value> values;

    AlgorithmicCrush() {
        values = new LinkedList<>();
    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int oper = in.nextInt();

        AlgorithmicCrush crush = new AlgorithmicCrush();
        for (int i = 0; i < oper; i++) {
            int fromIdx = in.nextInt();
            int toIdx = in.nextInt();
            int value = in.nextInt();
            crush.performOperation(fromIdx, toIdx, value);
        }
        System.out.println(crush.getMaxValue());
    }

    int getMaxValue() {
        values.sort(new Comparator());

        int currentValue = 0;
        for (Value val : values) {
            currentValue += val.value;
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }

    void performOperation(int fromIdx, int toIdx, int addValue) {
        values.push(new Value(fromIdx, addValue));
        values.push(new Value(toIdx + 1, -addValue));
    }

    class Comparator implements java.util.Comparator<Value> {

        @Override
        public int compare(Value v1, Value v2) {
            if (v1.idx != v2.idx) {
                return Integer.compare(v1.idx, v2.idx);
            } else return Integer.compare(v1.value, v2.value);
        }
    }

    class Value {
        int idx;
        int value;

        Value(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }
}
