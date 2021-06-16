package com.Tamizha;

import java.util.Scanner;

public class Switch {public static void main(String[]args){
    String name;
    Scanner inputName=new Scanner(System.in);
    name=inputName.next();
//Main Code Must Listen
    switch (name){
        case"tamizha" :
            System.out.println("Hi "+ name);
            break;
        case "vinoth" :
            System.out.println("Hi "+ name);
            break;
        case "vinot" :
            System.out.println("Hi "+ name);
            break;
        case "vino" :
            System.out.println("Hi "+ name);
            break;
        default:
            System.out.println("Not in List");
    }
}}
