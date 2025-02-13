package _02_Arrays;

import java.util.Arrays;

public class _04_Possition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ints = searchRange(nums, target);
    }
    public static int[] searchRange(int[] nums, int target) {

        int[] arr= {-1,-1};
        arr[0]=findStartIndex(nums,target,true);
        arr[1]=findStartIndex(nums,target,false);
        return arr;
    }

    public static int findStartIndex(int[] nums, int target, boolean startFirst){
        int ans = -1;
        int start =0;
        int end = nums.length -1;

        while(start<=end) {
            int mid = (start+end)/2;


            if(target < nums[mid]) {
                end = mid -1;
            } else if (target> nums[mid]) {
                start = mid+1;
            } else {
                ans = mid;
                if(startFirst) {
                    end = mid-1;
                } else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
