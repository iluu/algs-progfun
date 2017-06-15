package com.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SuperReducedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = superReducedString(s);
        System.out.println(result);
    }

    static String superReducedString(String input) {
        Pattern pattern = Pattern.compile("([a-z])\\1");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            input = matcher.replaceAll("");
            matcher.reset(input);
        }
        return input.equals("") ? "Empty String" : input;
    }

}
