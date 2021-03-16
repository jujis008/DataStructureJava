package com.learn.sort;

public class ShellSort {
    public static int[] shellSort(int[] array) {
        final int len = array.length;
        // step length
        for (int step = len/2; step > 0; step /= 2) {
            // for each step to handle separately.
            for (int i = step; i < len; i++) {
                int val = array[i];
                int j;
                // compare inside a step area
                for (j = i - step; j >= 0 && array[j] > val; j -= step) {
                    array[j + step] = array[j];
                }
                array[j + step] = val;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};
        for (int i : shellSort(arr)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
