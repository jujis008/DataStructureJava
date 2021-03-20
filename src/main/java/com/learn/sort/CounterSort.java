package com.learn.sort;

public class CounterSort {
    public static int[] counterSort(int[] array) {
        final int len = array.length;
        int[] buckets = new int[len];
        int sum = 0;
        int max = array[0], min = array [0];

        for (int item : array) {
            if (item > max) max = item;
            if (item < min) min = item;
        }
        int counterLen = max - min;
        int[] counters = new int[counterLen + 1];
        for (int value : array) {
            counters[value - min] += 1;
        }
        for (int i = 0; i < counterLen + 1; i++) {
            sum += counters[i];
            counters[i] = sum;
        }
        for (int i = len - 1; i >= 0; i--) {
            buckets[counters[array[i] - min] - 1] = array[i];
            counters[array[i] - min]--;
        }
        return buckets;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,15,30,0,2,3,0,3};
        int[] res = counterSort(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
