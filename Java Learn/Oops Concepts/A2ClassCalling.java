package com.Tamizha2;
public class A2ClassCalling {
    public  static void main(String[]args){
        Class2 inputClass2=new Class2();
        inputClass2.meth11();
        inputClass2.meth12();
        inputClass2.meth13("Tamizha13 ","Tamizha13 2String");
        System.out.println(inputClass2.meth21());
        System.out.println(inputClass2.meth22("Meth22 ","Meth22 2String"));
        System.out.println(inputClass2.meth31());
        System.out.println(inputClass2.meth32(5,8));

    }
}
class Class2{
    void meth11(){
        System.out.println("Tamizha1");
    }
    void meth12(){
        String num1="Tamizha12";
        System.out.println(num1);
    }
    void meth13(String num1,String num2){
        System.out.println(num1+num2);
    }
    String meth21(){
        String name1="Meth21";
        //System.out.println(name1);
        return name1;
    }
    String meth22(String name1,String name2){
        return name1;
    }
    int meth31(){
        int num1=2;
        return num1;
    }
    int meth32(int num1,int num2){
        return num1;
    }

}


