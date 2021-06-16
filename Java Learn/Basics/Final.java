package com.W3Schools;

public class Final {
    public static void main(String[]args){
        final int myNum = 15;  //This is final Variable ; Keyword : final
        myNum = 20;  // will generate an error: cannot assign a value to a final variable
        System.out.println(myNum);
    }
}
