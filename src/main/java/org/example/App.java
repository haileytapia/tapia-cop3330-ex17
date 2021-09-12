/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        int gender = 0, ouncesOfAlcohol = 0, weight = 0, hoursSinceDrink = 0, enteredNum = 0;
        double ratio = 0.0, BAC;
        Scanner input = new Scanner(System.in);

        while (enteredNum == 0)
        {
            System.out.print("Enter a 1 if you are male or a 2 if you are female: ");

            if (input.hasNextInt())
            {
                gender = input.nextInt();

                if (gender == 1)
                    ratio = 0.73;
                else
                    ratio = 0.66;

                enteredNum = 1;
            }
            else
                System.out.print("You must enter a number.\n");

            input.nextLine();
        }

        enteredNum = 0;

        while (enteredNum == 0)
        {
            System.out.print("How many ounces of alcohol did you have? ");

            if (input.hasNextInt())
            {
                ouncesOfAlcohol = input.nextInt();
                enteredNum = 1;
            }
            else
                System.out.print("You must enter a number.\n");

            input.nextLine();
        }

        enteredNum = 0;

        while (enteredNum == 0)
        {
            System.out.print("What is your weight, in pounds? ");

            if (input.hasNextInt())
            {
                weight = input.nextInt();
                enteredNum = 1;
            }
            else
                System.out.print("You must enter a number.\n");

            input.nextLine();
        }

        enteredNum = 0;

        while (enteredNum == 0)
        {
            System.out.print("How many hours has it been since your last drink? ");

            if (input.hasNextInt())
            {
                hoursSinceDrink = input.nextInt();
                enteredNum = 1;
            }
            else
                System.out.print("You must enter a number.\n");

            input.nextLine();
        }

        BAC = (ouncesOfAlcohol * 5.14 / weight * ratio) - .015 * hoursSinceDrink;
        String legality = BAC >= 0.08 ? "It is not legal for you to drive." : "It is legal for you to drive.";

        System.out.printf("Your BAC is %.6f\n%s", BAC, legality);
    }
}