package com.learn.sort;

public class SelectSort {
    public static int[] selectSort(int[] array) {
        final int len = array.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
//        int[] arr = {52, 63, 14, 59, 68, 35, 8, 67, 45, 90};
        int[] arr = {2,1,5,4,3,8,7};
        for (int i : selectSort(arr)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
