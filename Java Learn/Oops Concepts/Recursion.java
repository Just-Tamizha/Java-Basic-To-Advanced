package com.Tamizha;
public class Recursion {
    public static void main(String[]args) {

        System.out.println(sum(5));
        System.out.println(sum1(5,10));
    }
    //Single Parameter Conditions

    static int sum(int a){
        if(a>0){
            return a+ sum(a-1);
        }
        else return 0;
    }
    //Double Parameter Conditions

    static int sum1(int a,int b){
        if(b>a){
            return a+ sum1(a,b-2);
        }else return 0;
    }
    }
