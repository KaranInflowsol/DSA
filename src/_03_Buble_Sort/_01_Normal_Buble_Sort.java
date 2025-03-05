package _03_Buble_Sort;

import java.util.Arrays;

public class _01_Normal_Buble_Sort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,8,1};
        System.out.println(Arrays.toString(sortAlgorithm(arr)));
    }

    public static int[] sortAlgorithm(int[] arr) {
        boolean swap;
        for(int i=0;i<arr.length-1;i++){
            swap=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        return arr;
    }
}
