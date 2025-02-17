package _02_Arrays;

public class _12_SumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i=1; i<nums.length;i++) {
            ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }
}
