package com.codefights;

public class Menu {

    public static void main(String[] args) {
        smallestMultiple(1, 1);
    }

    static int smallestMultiple(int left, int right) {
        int max = 1;
        int[] divs = new int[right - left + 1];
        int j = 0;
        for(int i = left; i <= right; i ++) {
            max *= i;
            divs[j] = i;
            j++;
        }

        for (int i = left; i <= max; i ++){
            if ( divisible(divs, i)){
                return i;
            }
        }
        return 0;
    }

    static boolean divisible(int[] divs, int no){
        for(int i = 0; i < divs.length; i++){
            if (no % divs[i] != 0){
                return false;
            }
        }
        return true;
    }



}
