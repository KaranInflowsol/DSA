package _01_Basics;

import java.util.Scanner;

public class _08_Reverse_String {
    public static void main(String[] args) {
        System.out.print("Enter world that you want to reverse :");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reversed = reverseUsingForLoop(str);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseUsingForLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
