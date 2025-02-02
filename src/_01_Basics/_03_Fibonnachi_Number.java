package _01_Basics;

import java.util.Scanner;

public class _03_Fibonnachi_Number {
    public static void main(String[] args) {
        System.out.print("Enter any number up to that you want fibonachi number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp =0;
        int previous = 1;
        for(int i=0;i<num;i++) {
            System.out.println(temp);
           int next= previous+temp;
            temp=previous;
            previous=next;
        }
    }
}
