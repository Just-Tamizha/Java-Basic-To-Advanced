package com.Tamizha2;
public class A1AccessModifiers {
    public static void main(String[] args) {
        method1();
        method2();
        System.out.println(method3());
        System.out.println(method4(5,3));
    }

    private static void method1(){
        System.out.println("Vinoth");
    }

    static void method2(){
        System.out.println("Sudha");
    }

    static int method3(){
        return 5+3;
    }

    static int method4(int num1,int numb2){
        return num1+numb2;
    }
}
