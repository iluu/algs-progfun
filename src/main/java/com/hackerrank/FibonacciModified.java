package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        BigInteger trd = BigInteger.valueOf(b * b + a);
        BigInteger snd = BigInteger.valueOf(b);
        BigInteger result = BigInteger.ZERO;
        while (n - 3 > 0) {
            result = trd.multiply(trd).add(snd);
            snd = trd;
            trd = result;
            n--;
        }
        System.out.println(result);
    }
}
