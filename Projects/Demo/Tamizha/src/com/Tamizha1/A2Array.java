package com.Tamizha1;
import java.util.Arrays;
public class A2Array { public static void main(String[]args){
//Referance Data Type

//Method-1 (int Arrays)
    int[] Number=new int[3];
    Number[0]=10;
    Number[1]=20;
    Number[2]=30;
//System Result
    //System.out.println(Arrays.toString(Number));
    //System.out.println(Number[1]);

//Method-2 (int Array)Single Dimensions
    int[] Numb={5,6,8};
//System Result
    //System.out.println(Arrays.toString(Numb));
    //System.out.println(Numb[1]);

//Method-2 (int Array)Multi Dimensions
    int[][] numb={{5,6,8},{5,8,9}};
//System Result
    System.out.println(Arrays.toString(numb));
    //System.out.println(numb[0][1]);

//Char Array
    char[] tamizha={'a','b'};//You can Implement int Arrays Method-1
//System Result
    //System.out.println(tamizha);//'Arrays.toString' not Need
    //System.out.println(tamizha[1]);

//Length
    int Len=tamizha.length;
//System Result
    //System.out.println(Len);

//Clone
    char[] tamziha1=tamizha.clone();
//System result
    //System.out.println(tamziha1[1]);
}}