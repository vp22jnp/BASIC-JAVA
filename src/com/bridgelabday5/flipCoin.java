package com.bridgelabday5;

import java.util.Random;

public class flipCoin {
    public static void main(String[] args) {

        int heads = 0;
        int tails = 0;
        for(int i=1;i<=10;i++) {
            double rand = Math.random();
            String coin = "";
            if (rand < 0.5)
                heads++;
            else tails++;
        }
        System.out.println("head probebility" + tails/10.0);
            System.out.println("tails probebility"+( heads/10.0));
        }
    }
