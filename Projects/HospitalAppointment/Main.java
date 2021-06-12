package com.ProjectHospital;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Welcome input1=new Welcome();
        input1.welCome();
        input1.help();
    }
}
class Welcome {
    int avil = 2;
    void welCome() {
        // System.out.println("-----------------------------");
        System.out.println("Welcome to Tamizha Hospital");
        // System.out.println("-----------------------------");
    }
    void help() {
        System.out.println("1.Appointment Doctor");
        System.out.println("2.Visit Doctor");
        System.out.println("3.Exit");
        // System.out.println("-----------------------------");
        System.out.println("Kindly Enter The Number!");
        inputValue();
    }
    void inputValue() {
        Scanner inputValue = new Scanner(System.in);
        int selectionValve = inputValue.nextInt();
        if (selectionValve == 1) {
            doctors();
        } else if (selectionValve == 2) {
            System.out.println("Visit");
        } else if (selectionValve == 3) {
            help();
        } else {
            System.out.println("You enter The wrong number");
            inputValue();
        }
    }
    void doctors() {

        //System.out.println("-----------------------------");
        System.out.println("Docter Name List");
        //System.out.println("-----------------------------");
        System.out.println("1.Tamizha");
        System.out.println("2.Vinoth");
        //System.out.println("-----------------------------");
        System.out.println("Kindly Enter The Number!");
        //System.out.println("-----------------------------");
        Scanner docterno = new Scanner(System.in);
        int doctername = docterno.nextInt();
        if (doctername == 1) {
            avil-=1;
            if(avil>0){
                System.out.println("Your appointment is Booked "+"Remain Slots "+avil);

            }
            else{
                System.out.println("Appointment is Closed");
            }
        }
        doctors();

    }
}


