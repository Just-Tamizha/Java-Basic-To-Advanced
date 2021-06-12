package com.Tamizha2;

public class A8Super {
    public static void main(String []args){
        B3 Sup=new B3();
        Sup.MethOverride();


    }
}
class B2 {
    B2() {
        System.out.println("S");
    }

    B2(int Ai55) {
        System.out.println(Ai55);
    }
    void MethOverride(){
        System.out.println("Without Overide");
    }
}
class B3 extends B2{

    B3() {
        System.out.println("B3 is printed");
    }
    B3(int Ai){
        super(Ai);
        System.out.println(Ai);
    }

    void MethOverrid(){
        System.out.println("Overrided");
    }
}