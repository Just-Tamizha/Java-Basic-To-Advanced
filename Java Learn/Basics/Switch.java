package com.Tamizha;

import java.util.Scanner;

public class switchCase {public static void main(String[]args){
    String name;
    Scanner inputName=new Scanner(System.in);
    name=inputName.next();
//Main Code Must Listen
    switch (name){
        case"Tamizha" :
            System.out.println("Hi "+ name);
            break;
        case "Vinoth" :
            System.out.println("Hi "+ name);
            break;
        case "Vinot" :
            System.out.println("Hi "+ name);
            break;
        case "Vino" :
            System.out.println("Hi "+ name);
            break;
        default:
            System.out.println("Sorry Sir,Your name Not in List");
    }
}}
