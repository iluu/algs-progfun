package com.hackerrank;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        byte c[] = new byte[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextByte();
        }

        System.out.println(calculateEnergy(c, k));
    }

    static int calculateEnergy(byte[] c, int k) {
        int energy = 100;
        int i = 0;
        while ((i = (i + k) % c.length) != 0) {
            energy = calculateEnergy(c, energy, i);
        }

        return calculateEnergy(c, energy, i);
    }

    private static int calculateEnergy(byte[] c, int energy, int i) {
        return c[i] == 1 ? energy - 3 : energy - 1;
    }

}
