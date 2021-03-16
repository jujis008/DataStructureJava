package com.learn.stack;


public class ArrayStack {
    private int defaultLength = 32;
    private int[] array = new int[defaultLength];

    public int push(int data) {
        if (array.length >= defaultLength) {

        }
        return 0;
    }

    public void enlargeSize(int[] array) {
        final int cur = array.length;
        final int newSize = cur << 2;

    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE + 1 < 0);
    }
}
