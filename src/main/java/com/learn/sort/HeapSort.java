package com.learn.sort;

public class HeapSort {
    public static void heapSort(int[] arr) {
        final int len = arr.length;
        for (int i = (len - 1) / 2; i >= 0; i--) {
            adjustHeap(arr, i, len);
        }
        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = len - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            //重新对堆进行调整
           adjustHeap(arr, 0, i);
        }
    }

    public static void adjustHeap(int[] arr, int parent, int length) {
        // 将temp作为父节点
        int temp = arr[parent];
        int leftChild = 2 * parent + 1;
        while (leftChild < length) {
            int rightChild = leftChild + 1;
            if (rightChild < length && arr[leftChild] < arr[rightChild]) {
                leftChild++;
            }
            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= arr[leftChild]) break;
            // 把孩子结点的值赋给父结点
            arr[parent] = arr[leftChild];
            // 选取孩子结点的左孩子结点,继续向下筛选
            parent = leftChild;
            leftChild = 2 * leftChild + 1;
        }
        arr[parent] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {16, 7, 3, 20, 17, 8};
        heapSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
