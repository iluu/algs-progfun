package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class VeryBigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger result = BigInteger.ZERO;

        int len = in.nextInt();
        for (int i = 0; i < len; i++) {
            result = result.add(BigInteger.valueOf(in.nextInt()));
        }
        System.out.println(result);
    }

}
