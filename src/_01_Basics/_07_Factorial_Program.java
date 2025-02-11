package _01_Basics;

import java.util.Scanner;

public class _07_Factorial_Program {
    public static void main(String[] args) {
        System.out.print("Enter any number for factorial number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial  =1;
        for(int i=num;i>=1 ;i--) {
            factorial*=i;
        }
        System.out.println("factorial number of "+num +" is "+factorial);
    }
}
