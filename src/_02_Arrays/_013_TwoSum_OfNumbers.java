package _02_Arrays;

import java.util.Arrays;

public class _013_TwoSum_OfNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(numbers, target);
        System.out.println(Arrays.toString(ints));

    }

        public static int[] twoSum(int[] nums, int target){
            int start = 0 ;
            int end = nums.length -1;
            while(start<end) {
                int sum = nums[start] + nums[end];
                if(sum == target) {
                    return new int[]{nums[start]+nums[end]};
                } else if( sum < target) {
                    start ++;
                } else {
                     end --;
                }
            }

            return new int[]{-1,-1};
        }



}
