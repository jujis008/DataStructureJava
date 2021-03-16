package com.learn.sort;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        final int len = array.length - 2;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array, int k) {
        final int len = array.length;
        int j = k;
        int n;
        while (j > 0) {
            n = j;
            j = 0;
            for (int s = 0; s < n - 1; s++) {
                if (array[s] > array[s+1]) {
                    int temp = array[s];
                    array[s] = array[s + 1];
                    array[s + 1] = temp;
                    j = s;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,8,7};

        for (int i : bubbleSort(nums)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : bubbleSort(nums, nums.length - 2)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
