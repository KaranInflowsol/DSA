package _01_Basics;

import java.util.Scanner;

public class _09_Pattern {
    public static void main(String[] args) {
        System.out.print("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num;i++) {
            for(int j =0; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
