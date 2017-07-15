package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger result = BigInteger.valueOf(n);
        for (int i = n - 1; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result.toString());
    }
}
