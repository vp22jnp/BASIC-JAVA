package com.day2;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("enter one digit number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(number==1) {
            System.out.println("one");
        }else{
            System.out.println("not single digit number");
        }
    }
}