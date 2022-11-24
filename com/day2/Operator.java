package com.day2;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int a,b,c,first,second,third,forth;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        a=sc.nextInt();
        System.out.println("enter b");
        b= sc.nextInt();
        System.out.println("enter c");
        c= sc.nextInt();
         first=a+b*c;
        second=c+a/b;
        third=a%b+c;
        forth=a*b+c;
        System.out.println("value for first is" +first);
        System.out.println("value for second is" +second);
        System.out.println("value for third is" +third);
        System.out.println("value for forth is" +forth);
    }
    }



