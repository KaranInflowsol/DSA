package _06_Cycle_Sort;

import java.util.Arrays;

public class _01_Cycle_Sort_Algorithm {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycleSortAlgorithm(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void cycleSortAlgorithm(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swapNumbers(arr, i , correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void swapNumbers(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
