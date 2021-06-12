package com.Tamizha1;

import java.util.Locale;
import java.util.Scanner;
public class A8Scanner {public static void main(String[]args){
//Without String
    int number;
    //Important Code For Collect Data
    Scanner input=new Scanner(System.in);
    System.out.println("Whats Your Age?");
    //Must mention the Primitives
    number= input.nextInt();
//System Result
    System.out.println("Your Age is "+number);

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
    System.out.println("hi "+name);
}}

 /*Scanner Test
    String name;
    char name1;
    int number1;
    Scanner ageData=new Scanner(System.in);
    System.out.println("Enter your Name");
    name =ageData.nextLine();
    System.out.println("Enter your Age");
    number1=ageData.nextInt();
    System.out.println("Your name is "+name);
    System.out.println("Your age is "+number1); */