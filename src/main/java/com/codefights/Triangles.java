package com.codefights;

public class Triangles {

    public static void main(String[] args){
        System.out.println(numberOfTriangles2(new int[]{3, 5, 7, 9}));
    }

    static int numberOfTriangles2(int[] sticks) {

        int ans = 0;
        for (int i = 0; i < sticks.length - 2; i++) {
            for (int j = i + 1; j < sticks.length - 1; j++) {
                int mx = sticks[i] + sticks[j];
                int l = j,
                        r = sticks.length;
                while (r - l > 1) {
                    int m = (l + r) / 2;
                    if (sticks[m] >= mx) {
                        r = m;
                    } else {
                        l = m;
                    }
                }
                ans += l - j;
            }
        }

        return ans;
    }
}
