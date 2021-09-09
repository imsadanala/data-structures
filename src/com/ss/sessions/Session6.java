package com.ss.sessions;

import java.util.Arrays;

public class Session6 {
    public static void main(String[] args) {
        new Session6().mergeSort(new int[]{7, 5, 9, 7, 9, 3});
    }

    /**
     * Merge sort uses the Divide&Conquer to sort the elements
     * 1.Divide
     * 2.compare & swap
     * 3.conquer
     *
     * @param input
     */
    public void mergeSort(int[] input) {
        divide(input);
    }

    private void divide(int[] input) {
        if (input.length == 1) {
            return;
        }
        int start = 0;
        int mid = input.length / 2;
        int end = input.length;
        int[] leftArray = copyOfRange(start, mid, input);
        divide(leftArray);
        int[] rightArray = copyOfRange(mid, end, input);
        divide(rightArray);
        conquer(leftArray, rightArray, input);
        System.out.println(Arrays.toString(input));
    }

    private int[] copyOfRange(int start, int end, int[] sourceArray) {
        int size = end - start;
        int[] result = new int[size];
        int index = 0;
        while (start < end) {
            result[index] = sourceArray[start];
            index++;
            start++;
        }
        return result;
    }

    private int[] conquer(int[] leftArray, int[] rightArray, int[] sourceArray) {

        int soureIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                sourceArray[soureIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                sourceArray[soureIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            soureIndex++;
        }

        while (leftIndex < leftArray.length) {
            sourceArray[soureIndex] = leftArray[leftIndex];
            leftIndex++;
            soureIndex++;
        }

        while (rightIndex < rightArray.length) {
            sourceArray[soureIndex] = rightArray[rightIndex];
            rightIndex++;
            soureIndex++;
        }

        return sourceArray;
    }
}
