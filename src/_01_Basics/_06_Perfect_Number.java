package _01_Basics;

import java.util.Scanner;

public class _06_Perfect_Number {
    public static void main(String[] args) {
        System.out.print("Enter any number that you want to check it is perfect number or not :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        for(int i=1;i<num;i++) {
            int temp = num%i;
            if(temp==0) {
                sum+=i;
            }
        }
        if(num==sum) {
            System.out.println(sum+"  this is perfect number");
        } else {
            System.out.println(num+" this is not perfect number");
        }
    }
}
