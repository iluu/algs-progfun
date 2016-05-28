package com.codefights;

public class Mod10 {

    public static void main(String[] args){
        System.out.println(modulo10("1561666161616161199898", "1111111111111122121211"));
    }

    static int modulo10(String a, String b) {
        return Short.valueOf(a.substring(a.length() - 1))
                * Short.valueOf(b.substring(b.length() - 1)) % 10;
    }
}
