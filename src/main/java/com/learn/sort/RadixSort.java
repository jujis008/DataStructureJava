package com.learn.sort;

public class RadixSort {
    public static void radixSort(int[] array) {
        final int len = array.length;
        final int bucketNum = 10;
        // 待排序列最大值
        int max = array[0];
        // 指数
        int exp;

        // 计算最大值
        for (int val : array) {
            if (max < val) max = val;
        }
        // 从个位开始，对数组进行排序
        for (exp = 1; max / exp > 0; exp *= 10) {
            // 存储待排元素的临时数组
            int[] temp = new int[len];
            // 分桶个数
            int[] buckets = new int[bucketNum];

            // 将数据出现的次数存储在buckets中
            for (int val : array) {
                buckets[(val / exp) % 10]++;
            }

            //更改buckets[i]，
            for (int i = 1; i < bucketNum; i++) {
                buckets[i] += buckets[i - 1];
            }
            //将数据存储到临时数组temp中
            for (int i = len - 1; i >= 0; i--) {
                int idx = (array[i] / exp) % 10;
                temp[buckets[idx] - 1] = array[i];
                buckets[idx]--;
            }
            //将有序元素temp赋给arr
            System.arraycopy(temp, 0,  array, 0, len);
        }
    }

    public static void main(String[] args) {
        int[] arr = {63, 157, 189, 51, 101, 47, 141, 121, 157, 156, 194, 117, 98, 139, 67, 133, 181, 12, 28, 0, 109};
        radixSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
