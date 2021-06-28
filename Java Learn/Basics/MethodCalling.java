package com.Tamizha;

public class MethodCalling {

    public static void main(String[] args) {
        myMethod();
        myMethod2("Tamizha");
        System.out.println(myMethod3(1,2));
        int x=myMethod4(1,2);
        System.out.println(x);
        myMethod5(20);
        double y=myMethod3(1.2,1.3);
        int z=(int)myMethod3(1.2,1.3); //Double to Int method used
        System.out.println(y);
        System.out.println(z);
        System.out.println(myMethod6(1,2));
        //Meth 1
        MethodCalling A=new MethodCalling();
        System.out.println(A); //Something Error
        //Meth 2
        new MethodCalling();
    }
    static void myMethod(){
        System.out.println("Same Class Method");
    }
    static void myMethod2(String name){
        System.out.println("Same Class Method With String "+name);
    }
    static int myMethod3(int x,int y){
        System.out.println("Same Class Method with primitive data types Note: Without Void");
        return x+y;
    }
    static int myMethod4(int a,int b){
        System.out.println("Same Class method with primitive date types and parameters Note: Value Assign for variable using methods");
        return a+b;
    }
    //With Void
    static void myMethod5(int age){
        if (age>18){
            System.out.println("You are Qualified");
        }else {
            System.out.println("You are under Qualified");
        }
    }
    //Without Void
    static int myMethod6(int x,int y) {
        if (x > 0) {
            System.out.println("Without Void If Condition");
            return x;
        } else {
            System.out.println("Without Void else Condition");
            return 0;
        }
    }

    static double myMethod3(double x,double y){
        System.out.println("Same Method name But Data type different check it ! carefully");
        return x+y;
    }
    // Meth

    MethodCalling(){
        System.out.println("Without Static void ");
    }
}
