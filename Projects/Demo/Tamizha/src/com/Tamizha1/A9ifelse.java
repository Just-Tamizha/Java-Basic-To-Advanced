package com.Tamizha1;

import javax.naming.Name;
import java.util.Scanner;

public class A9ifelse {public static void main(String[]args){

    //Doubt-String not Work in varible string but work with numbers

    String userName="tamizha";
    String username;
    Scanner userEnter=new Scanner(System.in);
    username=userEnter.nextLine();
    if (username==userName)
        System.out.println("Your are Verified");
    else
        System.out.println("You enter the wrong username");
    /*int numb=10;
    int numbe;
    Scanner inputnumbe=new Scanner(System.in);
    numbe=inputnumbe.nextInt();
    if(numb>=numbe){
        System.out.println("enter is correct");
    }
    else System.out.println("your are wrong");*/
}}
