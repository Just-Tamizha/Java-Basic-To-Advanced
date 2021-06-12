package com.Tamizha2;

public class A7Inheritance {
    public static void main(String[]args){
        //Inheritance called
        sub Sub=new sub(6,8);
        Sub.run();

    }
}
class add{
    add(){

    }
    add(int a,int b){
        System.out.println(a+b);
    }
    void run() {
        System.out.println("Inheritance is Worked");
    }
}

//inheritance are used "extends"
class sub extends add{
   sub(int a,int b){
        System.out.println(a-b);
    }
}
// Different 2 class are use same class for extends name as hieratical inheritance