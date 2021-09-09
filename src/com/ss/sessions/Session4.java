package com.ss.sessions;

import java.util.Arrays;

public class Session4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{9, 8, 6, 5, 4, 3})));
    }

    private static int[] insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int j = i - 1;
            while (j >= 0 && input[j] > input[i]) {
                input[j + 1] = input[j];
                j--;
            }
            input[j+1] = input[i];

        }
        return input;
    }
}
