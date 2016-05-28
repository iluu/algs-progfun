package com.hackerrank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheGridSearch {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("inputs/grid-search.txt");
        System.out.println(f.getAbsolutePath());
        Scanner in = new Scanner(new FileInputStream(f));

        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }

            System.out.println(findPattern(G, P) ? "YES" : "NO");
        }
    }

    private static boolean findPattern(String[] grid, String[] pattern){
        int lastIdx = 0;
        for(int i = 0; i < grid.length; i++) {
            while((lastIdx = grid[i].indexOf(pattern[0], lastIdx)) >= 0){
                if(findPattern(grid, pattern, lastIdx, i)) {
                    return true;
                } else {
                    lastIdx++;
                }
            }
        }
        return false;
    }

    private static boolean findPattern(String[] g, String[] p, int col, int row) {
        for(int i = row, j=0; j < p.length && i < g.length; i++,j++){
            if(!g[i].regionMatches(col, p[j], 0, p[j].length())){
                return false;
            }
        }
        return true;
    }

}
