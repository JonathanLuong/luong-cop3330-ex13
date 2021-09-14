package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader


        System.out.printf("Enter the principal: ");
        String principal = reader.nextLine();
        System.out.printf("Enter the rate of interest: ");
        String rate = reader.nextLine();
        System.out.printf("Enter the number of years: ");
        String years = reader.nextLine();
        System.out.printf("What is the number of times the interest is compounded per year? ");
        String cYears = reader.nextLine();


        float p = Float.parseFloat(principal);
        float r = (Float.parseFloat(rate))/100;
        float t = Float.parseFloat(years);
        float n = Float.parseFloat(cYears);
        float x = 1+(r/n);
        float y = n*t;
        float z = (float) Math.pow(x,y);
        float a = p * z;

        System.out.println("$"+ principal +" invested at " + rate + "% for " + years + " years compounded " + cYears + " times per year is $"+ a +".");
    }
}