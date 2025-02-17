package _02_Arrays;

public class _11_Concatination {
    public static void main(String[] args) {
       int[] nums = {1,2,1};
        int[] result = getConcatenation(nums);
        for(int i=0; i< result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];

        for(int i=0; i<n;i++){
            ans[i]=nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
