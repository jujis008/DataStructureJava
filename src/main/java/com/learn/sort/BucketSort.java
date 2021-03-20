package com.learn.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(int[] array) {
        final int len = array.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // 计算最大值与最小值
        for (int value : array) {
            max = Integer.max(max, value);
            min = Integer.min(min, value);
        }
        // 计算最大值与最小值
        int bucketNum = (max - min) / len + 1;
        List<List<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketArr.add(new ArrayList<>());
        }
        // 将每个元素放入桶
        for (int value : array) {
            int num = (value - min) / len;
            bucketArr.get(num).add(value);
        }
        // 对每个桶进行排序
        for (List<Integer> integers : bucketArr) {
            Collections.sort(integers);
        }
        // 将桶中的元素赋值到原序列
        int index = 0;
        for (List<Integer> list : bucketArr) {
            for (Integer integer : list) {
                array[index++] = integer;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,15,30,0,2,3,0,3,20};
        bucketSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
