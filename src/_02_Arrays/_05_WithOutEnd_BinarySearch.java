package _02_Arrays;

public class _05_WithOutEnd_BinarySearch {

    public static void main(String[] args) {
        int arr[] = {0,2,3,4,5,6,7,8,9,11,12,14,15,17,21,22,25};
        int target  = 10;
        int start = 0;
        int end = 1;
        int result = binarySearch(arr, target, start, end);
        System.out.println("-----------------> "+ result);
    }


    // own solved problem

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while(start<=end) {
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
//                if (target >= arr[start] && target <= arr[end]) {
//                    return -1;
//                }
                if(start>end) {
                    start = end;
                    end = start*2;
                }
            } else  {
                return  mid;
            }
        }

        return -1;
    }
}
