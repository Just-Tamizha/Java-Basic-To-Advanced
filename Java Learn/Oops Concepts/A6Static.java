package com.Tamizha2;

public class A6Static {
    public static void main(String[]args){
        ClassStatic Out=new ClassStatic();
        System.out.println(ClassStatic.principal);

    }

}
class ClassStatic{
    int rollNo;
    int Class;

    //Static Method Used
   static String principal="Tamizha";
    void output(){
        System.out.println();
    }
    //Static Method Used different
    static {
        principal="Tamiha";

    }
}
