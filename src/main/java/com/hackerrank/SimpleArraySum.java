package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < len; i++) {
            result = result.add(BigInteger.valueOf(in.nextInt()));
        }
        System.out.println(result);
    }

}
