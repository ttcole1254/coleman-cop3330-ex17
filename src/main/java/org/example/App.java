package org.example;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
        int gender = in.nextInt();
        System.out.println("How many ounces of alcohol did you have? ");
        double ounces = in.nextDouble();
        System.out.println("What is your weight, in pounds? ");
        double weight = in.nextDouble();
        System.out.println("How many hours has it been since your last drink? ");
        double hours = in.nextDouble();
        double r = 0;
        if (gender == 1) {
            r = 0.73;
        }
        else if (gender == 2) {
            r = 0.66;
        }
        double bac = (ounces * 5.14 / weight * r) - 0.015 * hours;
        System.out.printf("Your BAC is %f\n", bac);
        if (bac <= 0.08) {
            System.out.println("Is it legal for you to drive,");
        }
        else {
            System.out.println("It is not legal for you to drive.");
        }
    }
}
