package com.Tamizha;
public class
LogicalOperators {public static void main(String[]args){
//Logical Operators
    int ageOfPerson=10;
    boolean indianCitizen=true;
//System result
    System.out.println(ageOfPerson==18&&indianCitizen==true);
    System.out.println(ageOfPerson==18||indianCitizen==true);
    System.out.println(!indianCitizen==true);

//Terinary Operators
    String name=ageOfPerson>=18?"Eligible":"Not Eligible";
//System Result
    System.out.println(name);
    //System.out.println(ageOfPerson>=18?"Eligible":"Not Eligible");
}}
