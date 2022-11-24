package com.day2;

public class ForLoop1 {
    public static void main(String[] args) {
        int num = 5, count, total = 0;

        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of first 10 natural numbers is: "+total);
    }
}