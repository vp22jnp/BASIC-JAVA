package com.bridgelabday6;
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
            int d, number,reverse, revnum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number ::");
            number = sc.nextInt();
            reverse = number;
            while (reverse >0) {
                d = reverse %10;
                revnum = (revnum*10)+d;
                reverse = reverse/10;
            }
            System.out.println("Reverse of the given number is:"+revnum);
        }
    }