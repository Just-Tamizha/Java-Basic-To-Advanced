package com.Tamizha;
import java.util.Arrays;
public class array { public static void main(String[]args){
//Arrays

//Method-1 (int-Arrays)
    int[] Number=new int[3];
    Number[0]=10;
    Number[1]=20;
    Number[2]=30;
//System Result
    //System.out.println(Arrays.toString(Number));
    //System.out.println(Number[1]);

//Method-2 (int-Array)Single Dimensions
    int[] Numb={5,6,8};
    Numb[1]=9;
//System Result
    //System.out.println(Arrays.toString(Numb));
    //System.out.println(Numb[1]);

//Method-2 (int-Array)Multi Dimensions
    int[][] numb={{1,2,3},{4,5,6}};
//System Result
    //System.out.println(Arrays.toString(numb[0]));
    //System.out.println(numb[0][1]);

//Char Array
    char [] tamizha={'a','b'};//You can Implement int Arrays Method-1
//System Result
    //System.out.println(Arrays.toString(tamizha));
    //System.out.println(tamizha);// Without 'Arrays.toString'
    //System.out.println(tamizha[1]);

//String Array
    String [] tamizha1={"Shan","Vinoth"};//You can Implement int Arrays Method-1
//System Result
    //System.out.println(Arrays.toString(tamizha1));
    //System.out.println(tamizha1);// Without 'Arrays.toString' but ERROR
    //System.out.println(tamizha1[1]);

//Loop with Arrays
    //For Loop
    for (int a=0;a<1;a++){
        //System.out.println(tamizha1[a]);
    }
    //Each Loop
    for (String b:tamizha1){
        //System.out.println(b);
    }
    for (int c=0;c<numb.length;c++){
        for (int d=0;d<numb[c].length;d++){
            //System.out.println(numb[c][d]);
        }
    }
//Length
    int Len=tamizha.length;
//System Result
    //System.out.println(Len);

//Clone
    char[] tamziha1=tamizha.clone();
//System result
    //System.out.println(tamziha1[1]);
}}
