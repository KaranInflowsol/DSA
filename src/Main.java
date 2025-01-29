import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = sc.nextInt();

        int sum =0;
        int multi =1;

        while (number > 0) {
             sum = sum +(number%10);
             multi = multi * (number%10);
             number=number/10;
        }
        int diff= multi-sum;
        System.out.println(diff);
    }
}