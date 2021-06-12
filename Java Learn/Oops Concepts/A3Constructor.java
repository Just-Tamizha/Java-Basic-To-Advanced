package com.Tamizha2;

public class A3Constructor {
    public static void main(String[] args) {
        car audi = new car();
        System.out.println(audi.speed);
    }
}
//Constructor
class car{
    int speed;
    int hp;
    car(int s,int ss){
        speed=s;
        hp=ss;
        System.out.println("Parameter Constructor is working");
    }
    car(){
      speed=500;
        System.out.println("Default Settings is working");
    }
}