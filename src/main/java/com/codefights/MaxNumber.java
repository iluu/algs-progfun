package com.codefights;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxNumber {

    public static void main(String[] args){
        System.out.println(obtainMaxNumber(new int[]{2, 4, 8, 1, 1, 15}));
    }

    static int obtainMaxNumber(int[] inputArray) {

        int result = 0;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        ArrayList<Integer> mantissa = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            int value = inputArray[i];
            //...
            if (!cnt.containsKey(value)) {
                mantissa.add(value);
                cnt.put(value, 0);
            }
            cnt.put(value, cnt.get(value) + inputArray[i] / value);
        }

        for (int i = 0; i < mantissa.size(); i++) {
            int exponent = 0;
            int power = 1;
            while (power * 2 <= cnt.get( mantissa.get(i) )) {
                exponent++;
                power *= 2;
            }
            result = (int)Math.max(result, mantissa.get(i) * Math.pow(2, exponent));
        }
        return result;
    }
}
