package com.day2;

public class WhileLoop1 {
    public static void main(String[] args) {

        int num = 5, count = 1, total = 0;

        while(count <= num)
        {
            total = total + count;
            count++;
        }

        System.out.println("Sum of first 10 natural numbers is: "+total);
    }
}

