package com.day2;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String args[]) {
        char month;

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter month  ");
        month = scan.next().charAt(0);


        switch (month) {

            case '1':
                System.out.println(month + " jan");
                break;

            case '2':
                System.out.println(month + " feb");
                break;

            case '3':
                System.out.println(month+ " march");
                break;

            case '4':
                System.out.println(month + "april");
                break;

            case '5':
                System.out.println(month + " may");
                break;


            case '6':
                System.out.println(month + " june");
                break;

            case '7':
                System.out.println(month + " july");
                break;

            case '8':
                System.out.println(month + " august");
                break;

            case '9':
                System.out.println(month+ " september");
                break;


            default:
                System.out.println(month + " month is not available after 12");
                break;


        }
    }

}