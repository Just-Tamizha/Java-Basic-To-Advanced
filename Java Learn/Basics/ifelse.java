package com.Tamizha;

import javax.naming.Name;
import java.util.Scanner;

public class ifelse {public static void main(String[]args){
    String userName="Tamizha";
    String username;
    Scanner userEnter=new Scanner(System.in);
    username=userEnter.nextLine();
    if (username.equals(userName))
        System.out.println("Your are Verified");
    else
        System.out.println("You enter the wrong username");
}}
