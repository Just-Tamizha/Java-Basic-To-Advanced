package com.Tamizha2;

import java.util.Scanner;

public class A9Escapulation{
      public static void main(String[]args){
          int us1;
          UserData login=new UserData();
          Scanner userInput=new Scanner(System.in);
          us1=userInput.nextInt();
          login.setID(us1);
          System.out.println(login.getID());
      }
}
class UserData{
    private int userId;
    private String PassWord;

    void setID(int getUserID){
        userId=getUserID;
    }
    int getID(){
        return userId;
    }
}
