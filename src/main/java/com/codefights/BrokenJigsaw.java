package com.codefights;

class BrokenJigsaw {

    static int brokenJigsaw(String[] p) {
        int min = p[0].length();
        int[] zeros = new int[p.length];
        for(int i = 0; i < p.length; i++){
            int first = Math.max(p[i].indexOf('O'), 0);
            int last = p[i].lastIndexOf('O') > 0 ? p[i].lastIndexOf('O') + 1 : 0;

            int numberOfZeros = last - first;
            if (min > numberOfZeros){
                min = numberOfZeros;
            }

            zeros[i] = numberOfZeros;
        }

        int result = 0;
        for (int zero : zeros) {
            result += zero - min;
        }
        return result;
    }

}
