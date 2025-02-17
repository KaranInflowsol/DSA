package _02_Arrays;


public class _10_PermutationArray {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ints = buildArray(nums);
        for(int i =0; i<ints.length;i++) {
            System.out.print(ints[i]+ " ");
        }
    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }
}
