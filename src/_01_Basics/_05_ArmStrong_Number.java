package _01_Basics;

import java.util.Scanner;

public class _05_ArmStrong_Number {
    public static void main(String[] args) {
        System.out.print("Enter any number that you want to check it's armstrong number :");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int second = num;
        int third =num;

        int count=0;
        int kk=0;
        while(num>0){
            count++;
            num =num/10;
        }
        while(second>0){
            int armstrong =1;
            int rem = second%10;

            for(int i=1;i<=count;i++){
                armstrong = armstrong*rem;
            }
            kk +=armstrong;
            second=second/10;
        }
        if(kk==third){
            System.out.println(kk);
            System.out.println("This is armstrong number");
        } else {
            System.out.println("This is not a armstrong number");
        }

    }
}
