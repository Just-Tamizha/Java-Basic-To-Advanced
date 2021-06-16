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
                   
     //For Each Loop or Inhanced Loop
    String data[]={"ng","mg","jg"};
    for (int i=0;i<data.length;i++){
       // System.out.println(data[i]);
    }
    for ( String datas:data){
        System.out.println(datas);
    }
}}
