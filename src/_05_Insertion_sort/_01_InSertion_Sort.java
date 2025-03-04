package _05_Insertion_sort;

import java.util.Arrays;

public class _01_InSertion_Sort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,4,1};
        insertionSort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                }
            }
        }
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] =  arr[k];
        arr[k] = temp;
    }
}
