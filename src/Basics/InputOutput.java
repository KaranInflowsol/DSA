package Basics;

import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Any Number :");
          int num = sc.nextInt();
          int a=0;
          int b=1;
          int temp=0;
          for(int i=0; i<num;i++) {
               temp= a+b;
          }

        System.out.println("-------------"+temp);
    }
}


