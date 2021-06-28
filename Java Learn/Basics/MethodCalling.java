package com.Tamizha;

public class MethodCalling {

    public static void main(String[] args) {
        myMethod();//Type-1
        myMethod2("Tamizha"); //Type-2
        System.out.println(myMethod3(1,2)); //Type-3
        int x=myMethod4(1,2); //Type-4
        System.out.println(x);

        myMethod5(20); //Type-5

        double y=myMethod3(1.2,1.3); //Type-6
        int z=(int)myMethod3(1.2,1.3); //Double to Int method used
        System.out.println(y);
        System.out.println(z);

        MethodCalling A=new MethodCalling(); //Type-7 (Meth-1)
        System.out.println(A); //Something Error

        new MethodCalling();// (Meth-2)
    }
    //Type-1
    static void myMethod(){
        System.out.println("Same Class Method");
    }
    //Type-2
    static void myMethod2(String name){
        System.out.println("Same Class Method With String "+name);
    }
    //Type-3
    static int myMethod3(int x,int y){
        System.out.println("Same Class Method with primitive data types Note: Without Void");
        return x+y;
    }
    //Type-4
    static int myMethod4(int a,int b){
        System.out.println("Same Class method with primitive date types and parameters Note: Value Assign for variable using methods");
        return a+b;
    }
    //Type-5
    //-------With Void
    static void myMethod5(int age){
        if (age>18){
            System.out.println("You are Qualified");
        }else {
            System.out.println("You are under Qualified");
        }
    }
    //-------Without Void
    static int myMethod5(int x,int y) {
        if (x > 0) {
            System.out.println("Without Void If Condition");
            return x;
        } else {
            System.out.println("Without Void else Condition");
            return 0;
        }
    }
    //Type-6
    static double myMethod3(double x,double y){
        System.out.println("Same Method name But Data type different check it ! carefully");
        return x+y;
    }
    //Type-7
    MethodCalling(){
        System.out.println("Without Static void ");
    }
}
