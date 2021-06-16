package com.Tamizha;

import org.w3c.dom.CDATASection;

import java.util.Scanner;

public class Loop {public static void main(String[]args){

    //loops

    int userIn;
    Scanner userInput=new Scanner(System.in);
    userIn=userInput.nextInt();

    //for loop
    for (int initial=0;initial<userIn;
         initial++){
        System.out.println("For Loop");
    }

    //while loop
    while (userIn>0) {
        System.out.println("While Loop");
        userIn--;
    }

    //Doubt Scanner not work
    // Do while
    int number=3;
    do {
        System.out.println("Do While Loop");
        number--;}
    while (number>0);
    }

}}
