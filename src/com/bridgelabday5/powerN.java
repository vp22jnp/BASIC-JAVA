package com.bridgelabday5;

import java.util.Scanner;

public class powerN {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();
            System.out.print("The series is: ");
            for (int i = 1; i <= 31; i++)
            {
                System.out.print(2*i + " ");
            }
        }

}
