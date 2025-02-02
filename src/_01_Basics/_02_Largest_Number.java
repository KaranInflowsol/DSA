package _01_Basics;

import java.util.Scanner;

public class _02_Largest_Number {
    public static void main(String[] args) {
        System.out.println("Enter Three Number :");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;

        if(b>max) {
            max=b;
        } else if(c>max) {
            max =c;
        }
        System.out.println("Largest Number is :"+max);
    }
}
