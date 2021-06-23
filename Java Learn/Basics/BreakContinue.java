package com.Tamizha;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        int a=1;
        for (int b=1;b<5;b++){
            if (b==3){
                System.out.println("IN");
                continue;
            }
            System.out.println("OUT");
        }
        while (a<5){
            if (a==3){
                a++;
                System.out.println("1-IN");
                continue;
            }
            a++;
            System.out.println("2-OUT");
        }
    }
}