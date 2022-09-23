package com.bridgelabday5;
import java.util.Scanner;
public class quotientRemainder {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("enter first number:");
        System.out.println("enter second number:");

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = x / y;
        System.out.println("quotient is" + z);
        z = x % y;
        System.out.println("Remainder is" + z);
    }
}
