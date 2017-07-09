package com.other;

public class Euclidean {

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lcd(int a, int b){
        return a * (b / gcd(a, b));
    }

}
