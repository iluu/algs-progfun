package com.topcoder;

public class ChessboardPattern {

    public String[] makeChessboard(int rows, int columns) {
        String[] result = new String[rows];
        String c2 = ".X";
        for (int i = rows - 1; i >= 0; i--) {
            result[i] = new String(new char[columns / 2]).replaceAll("\0", c2);
            if (columns % 2 == 1) {
                result[i] += c2.charAt(0);
            }
            c2 = c2.equals(".X") ? "X." : ".X";

        }
        return result;
    }
}
