package com.bridgelabday6;
import java.util.*;
public class primeNumbers {
    public static void main(String args[]){
        int i, number;
        int prime = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        for(i = 2; i < number; i++) {
            if((number % i) == 0) {
                prime = 0;
            }
        }
        if (prime == 1)
            System.out.println(number+" is a prime number");
        else
            System.out.println(number+" is not a prime number");
    }
}

