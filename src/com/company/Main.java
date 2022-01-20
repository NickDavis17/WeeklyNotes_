package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Hello World!");

        int age = 17;
        double gpa = 3.4;
        boolean isSnowy = true;
        String city = "Columbus";

        System.out.println(age + " | " + gpa + " | " + isSnowy);
        System.out.println(city);
        System.out.println(city.toUpperCase());


        float pi = 3.14f;
        System.out.println(pi);

        int dailyHighs[] = {50, 60, 70, 80, 90};



        double quotient = 10.0/4;
        System.out.println(quotient);

        int i = 1;

        int result = ++i * 2;
        System.out.println(result);


        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println(name.toUpperCase());

    }
}
