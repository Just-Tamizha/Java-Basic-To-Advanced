package com.Tamizha;

import java.util.Locale;
import java.util.Scanner;
public class Scanner {public static void main(String[]args){
//Without String
    int number;
    //Important Code For Collect Data
    Scanner input=new Scanner(System.in);
    System.out.println("Whats Your Age?");
    //Must mention the Primitives
    number= input.nextInt();
//With String
    String name;
    //Important Code For Collect Data
    Scanner input1=new Scanner(System.in);
    System.out.println("Whats Your Name?");
    //Dont mention for String
    //name=input1.next();
    //or
    name=input1.nextLine();
//System Result
    System.out.println("Your name is "+name);
    System.out.println("Your Age is "+number);
}}
