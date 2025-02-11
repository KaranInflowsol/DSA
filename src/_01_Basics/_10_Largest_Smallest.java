package _01_Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _10_Largest_Smallest {
    public static void main(String[] args) {
        int [] candies =  {2,5,1,3,4,7};
        int[] shuffle = shuffle(candies, 3);
        System.out.println(shuffle);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
}
