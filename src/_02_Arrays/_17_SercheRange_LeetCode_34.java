package _02_Arrays;

import java.util.Arrays;

public class _17_SercheRange_LeetCode_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ints = searchRange(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(nums.length < 1) return new int[]{-1,-1};
        while(start < end ) {
            int mid = start + (end - start) /2;
            if (target == nums[mid] && nums[mid] == nums[mid+1]){
                return new int[]{mid, mid+1};
            }
            if(target > nums[mid]){
                start = mid ;
            } else {
                end = mid -1 ;
            }
        }
        return new int[]{-1,-1};
    }
}
