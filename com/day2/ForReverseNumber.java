package com.day2;

import java.util.Scanner;

public class ForReverseNumber {
        public static void main(String[] args) {
            int number,reverse=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number for reverse");
            number=sc.nextInt();
            while(number != 0)
            {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
}


