package com.bridgelabday5;
import java .util.*;
public class leapyear {
    public static void main(String[] args) {
        int year;
        System.out.println("enter an year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        //System.out.println("enter year"+year);
        if ((year % 4 == 0) && (year % 100 != 4) ||(year % 400 == 0)) {
            System.out.println("year is leap year:");
        } else{
                System.out.println("year is not leap year:");
            }


        }
    }
