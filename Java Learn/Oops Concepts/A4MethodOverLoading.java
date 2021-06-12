package com.Tamizha2;

public class A4MethodOverLoading {
    public static void main(String[]args){
      meth1(5);
      meth1(5,7);
    }
    static void meth1(int num1){
        System.out.println(num1);
    }
    static void meth1(int num1,int num2){
        System.out.println(num1+num2);
    }
}

