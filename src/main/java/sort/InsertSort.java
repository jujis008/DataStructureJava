package sort;

public class InsertSort {
    public static int[] insertSort(int[] array) {
        final int len = array.length;
        for (int i = 1; i < len; i++) {
            int indicator = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > indicator; j--) {
                array[j] = array[j - 1];
            }
            array[j] = indicator;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,23,6,78,34};
        for (int i : insertSort(arr)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
