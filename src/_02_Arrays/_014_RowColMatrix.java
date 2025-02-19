package _02_Arrays;

import java.util.Arrays;

public class _014_RowColMatrix {
    public static void main(String[] args) {
       int[][] nums = {
               {10,20,30,40},
               {15,25,25,45},
               {28,29,37,49},
               {33,34,38,50}
       };
       int target = 28;
        int[] search = search(nums, target);
        System.out.println(Arrays.toString(search));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length-1;
        while(r < matrix.length && c >=0) {
            if(matrix[r][c] == target) {
                return new int[]{r,c};
            }
            if(matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
