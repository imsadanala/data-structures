package com.ss.sessions;

import java.util.Arrays;

public class Session3 {
    public static void main(String[] args) {
        Session3 test = new Session3();
       // System.out.println(Arrays.toString(test.reverse(new int[]{6, 2, 7})));
       // System.out.println(Arrays.toString(test.reverseWithTemp(new int[]{1, 2, 3})));
    }

    /**
     * Outplace Algorithm
     * TC: O(n)
     * SC: O(1)
     *
     * @param input
     * @return
     */
    int[] reverse(int[] input) {
        int[] inputRev = new int[input.length];
        int endIndex = input.length - 1;
        int startIndex = 0;
        while (endIndex >= 0) {
            inputRev[startIndex] = input[endIndex];
            endIndex--;
            startIndex++;
        }
        return inputRev;
    }

    /**
     * Inplace Alogirthm
     * TC: O(n)
     * SC: O(1), no extra stackframe will be created
     *
     * @param input
     * @return
     */
    int[] reverseWithTemp(int[] input) {
        int temp;
        int startIndex = 0;
        int endIndex = input.length - 1;
        while (startIndex < endIndex) {
            temp = input[startIndex];
            input[startIndex] = input[endIndex];
            input[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return input;
    }

}
