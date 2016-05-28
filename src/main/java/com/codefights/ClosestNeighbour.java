package com.codefights;

class ClosestNeighbour {

    int[] closestNeighbor(int n, int a, int b, int c) {
        int[] result = new int[]{0, 0};
        int n1 = n - 1;
        while (n1 > 0 && result[0] == 0) {
            if (n1 % a == 0 && n1 % b == 0 && n1 % c == 0) {
                result[0] = n1;
            }
            n1--;
        }
        n1 = n + 1;
        while (result[1] == 0) {
            if (n1 % a == 0 && n1 % b == 0 && n1 % c == 0) {
                result[1] = n1;
            }
            n1++;
        }
        return result;
    }
}
