package _02_Arrays;

public class _07_SortedArray {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 5;
        int search = search(nums, target);
        System.out.println("------------------->  "+ search);
    }
    public static int search(int[] nums, int target) {
        int peak = findPeak(nums);
        int result1 = binarySearch(nums,target,0,peak);
        if(result1==-1){
            int result2 = binarySearch(nums,target,peak+1, nums.length-1);
            if(result2!=-1) {
                return result2;
            } else {
                return -1;
            }
        } else {
            return result1;
        }
    }

    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        if (arr.length == 1) return 0;
        while(start<end) {
            int mid = (start+end)/2;
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) { // Ensure mid+1 is within bounds.
                return mid;
            }
            if(arr[mid]>arr[mid+1]){
                end =  mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] nums, int target, int start , int peak) {
        while(start<=peak) {
            int mid = (start+peak)/2;
            if (nums[mid]==target) {
                return mid;
            }
            if(target>nums[mid]) {
                start = mid+1;
            } else {
                peak = mid-1;
            }
        }
        return -1;
    }
}

