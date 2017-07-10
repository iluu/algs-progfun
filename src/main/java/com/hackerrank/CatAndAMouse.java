package com.hackerrank;

import java.util.Scanner;

public class CatAndAMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int catA = Math.abs(z - x);
            int catB = Math.abs(z - y);

            if (catA > catB) {
                System.out.println("Cat B");
            } else if (catA < catB) {
                System.out.println("Cat A");
            } else {
                System.out.println("Mouse C");
            }
        }
    }
}
