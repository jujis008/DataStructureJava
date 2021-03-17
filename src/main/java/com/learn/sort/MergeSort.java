package com.learn.sort;

public class MergeSort {
    public static void mergeSort(int[] arr, int low, int mid, int high, int[] temp) {
        int i = 0;
        int j = low, k = mid + 1;
        while (j <= mid && k <= high) {
            if (arr[j] < arr[k]) {
                temp[i++] = arr[j++];
            } else {
                temp[i++] = arr[k++];
            }
        }
        while (j <= mid) {
            temp[i++] = arr[j++];
        }
        while (k <= high) {
            temp[i++] = arr[k++];
        }
        if (i > 0) System.arraycopy(temp, 0, arr, low, i);
//        replace with array copy
//        for (int n = 0; n < i; n++) {
//            arr[low + n] = temp[n];
//        }
    }

    public static void mergeSort(int[] arr, int low, int high, int[] temp) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid, temp); // merge left
            mergeSort(arr, mid + 1, high, temp); // merge right
            mergeSort(arr, low, mid, high, temp); // merge both left & right
        }
    }

    public static void mergeSort(int[] arr) {
        final int len = arr.length;
        int[] temp = new int[len];
        int next, left_min = 0, left_max, right_min, right_max;
        for (int step = 1; step < len; step *= 2) {
            right_min = left_max = left_min + 1;
            right_max = left_max + step;
//            left_min = right_max;
            while (left_min < len - step) {
                if (right_max > len) right_max = len;
                next = 0;
                while (left_min < left_max && right_min < right_max) {
                    if (arr[left_min] < arr[right_min]) {
                        temp[next++] = arr[left_min++];
                    } else {
                        temp[next++] = arr[right_min++];
                    }
                }
                while (left_min < left_max) {
                    arr[--right_min] = arr[--left_max];
                }
                while (next > 0) {
                    arr[--right_min] = temp[--next];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12,11,44,23,67,88,65,34,48,9,12,11,44,23,67,88,65,34,48,9,12};
        final int len = arr.length;
        int[] tmp = new int[len];
//        mergeSort(arr,0,len-1,tmp);
        mergeSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
