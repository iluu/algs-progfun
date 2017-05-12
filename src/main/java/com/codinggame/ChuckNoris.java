package com.codinggame;

import java.util.Scanner;

class ChuckNoris {

    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        byte[] rawbytes = message.getBytes("UTF-8");
        String bytes = "";
        for (int i = 0; i < rawbytes.length; i++) {
            String chunk = Integer.toBinaryString(rawbytes[i]);
            while (chunk.length() % 6 == 0) {
                chunk = '0' + chunk;
            }
            bytes += chunk;

        }

        char cChar = ' ';
        for (int i = 0; i < bytes.length(); i++) {
            if (cChar != bytes.charAt(i)) {
                if (cChar != ' ') { // first line hack
                    System.out.print(' ');
                }
                cChar = bytes.charAt(i);
                System.out.print(cChar == '0' ? "00 " : "0 ");
            }
            System.out.print('0');
        }
    }
}
