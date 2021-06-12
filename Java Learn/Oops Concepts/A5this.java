package com.Tamizha2;

public class A5this {
    public static void main(String[]args){
        ClassThis inputThis=new ClassThis(25);
        System.out.println(inputThis.number);
    }
}
class ClassThis{
    int number;
    ClassThis(int number){
        this.number=number;
    }
}