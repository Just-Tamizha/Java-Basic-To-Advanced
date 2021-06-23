package com.Tamizha;

import javax.naming.Name;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ifelse {public static void main(String[]args){
    String userName="Tamizha";
    String username;
    Scanner userEnter=new Scanner(System.in);
    username=userEnter.nextLine();
    if (username.equals(userName)){
        System.out.println("Your are Verified");
    }
    else
        System.out.println("You enter the wrong username");

//Ternary Operator
    int ageOfPerson=55;
    String name=ageOfPerson>=18?"Eligible":"Not Eligible";
    System.out.println(name);

//Another Method
    System.out.println(ageOfPerson>=18?"Eligible":"Not Eligible");
}}


