package com.codefights;

class AlmostIncreasingSequence {

    static boolean isAlmostIncreasing(int[] sequence) {
        int peakCount = 0;
        if (sequence[0] > sequence[1]) {
            peakCount++;
        }
        for (int i = 1; i < sequence.length - 1; i++) {
            if (sequence[i] > sequence[i + 1]) {
                if (canRecover(sequence, i)) {
                    peakCount++;
                } else {
                    return false;
                }
            }
        }
        return (peakCount <= 1);
    }

    private static boolean canRecover(int[] sequence, int idx) {
        if (sequence[idx - 1] < sequence[idx + 1]
                && (sequence.length <= idx + 2 || sequence[idx + 1] < sequence[idx + 2])) {
            return true;
        } else if (sequence[idx - 1] < sequence[idx]
                && (sequence.length <= idx + 2 || sequence[idx] < sequence[idx + 2])) {
            return true;
        }
        return false;
    }

}
