/*
	File Name: Driving.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 19, 2025
	Description: prompts user for age, and determines whether they are of driving age, above limit, or below
*/	

import java.util.Scanner;

public class Driving {
    public static void main(String[] args) {
        //declare final and variables
        final int LEGAL_LIMIT = 75;
        Scanner sc = new Scanner(System.in);
        int age;

        //prompt user for input
        System.out.print("How old are you? ");
        age = sc.nextInt();

        //check if age is out of limit, below limit, or okay
        if (age > LEGAL_LIMIT ) {
            System.out.printf("Age: %d, Sorry, you are over the legal age limit for driving.", age);
        } else if (age < 18) {
            System.out.printf("Age: %d, Too young to drive.", age);
        } else {
            System.out.printf("Age OK. Have you got a drivers licence?");
        }
        sc.close();
    }
}
