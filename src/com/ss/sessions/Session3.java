package com.ss.sessions;

import java.util.Arrays;

public class Session3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1})));
    }

    /**
     * @param input
     * @return
     */
    private static int[] selectionSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = input[i];
                input[i] = input[minIndex];
                input[minIndex] = temp;
            }
        }
        return input;
    }


}
