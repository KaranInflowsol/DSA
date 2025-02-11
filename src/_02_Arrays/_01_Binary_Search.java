package _02_Arrays;

import java.util.Arrays;

public class _01_Binary_Search {

    public static void main(String[] args) {
       int[] arr = {0,1,12,15,17,21,26,29,38,99};
       int target = 29;
        int i = binarySearch(arr, target);
        System.out.println("----------------> "+ i);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int mid = (start+end)/2;

            if(target>arr[mid]){
                start = mid + 1;

            } else if (target<arr[mid]) {
                end = end-1;
            } else {
                return mid;
            }

        }
       return -1;
    }
}
