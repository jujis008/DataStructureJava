package com.learn.sort;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low > high) return;
        int i = low, j = high, temp = arr[low];
        while (i < j) {
            // right side
            while (temp <= arr[j] && i < j) {
                j--;
            }
            // left side
            while (temp >= arr[i] && i < j) {
                i++;
            }
            // swap arr[i] arr[j]
            if (i < j) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        // 最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        // 递归调用左半数组
        quickSort(arr, low, j - 1);
        // 递归调用右半数组
        quickSort(arr, j + 1, high);
    }

    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
