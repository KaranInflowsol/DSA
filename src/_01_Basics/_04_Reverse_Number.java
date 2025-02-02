package _01_Basics;

import java.util.Scanner;

public class _04_Reverse_Number {

    public static void main(String[] args) {
        System.out.print("Enter any number that you want to reverse :");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int reverse=0;
        while(num>0){
            int temp = num%10;
            num/=10;
            reverse=reverse*10+temp;

        }
        System.out.println(reverse);
    }
}
