/*
	File Name: DogTreats.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 17, 2025
	Description: prompts user for how many of each size treat Barley was given, and prints whether Barley is happy, sad, or OK.
*/	

import java.util.Scanner;

public class DogTreats {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int small, medium, large, happyscore;

        //prompts user for inputs
        System.out.print("Enter the amount of small treats Barley ate: ");
        small = sc.nextInt();
        System.out.print("Enter the amount of medium treats Barley ate: ");
        medium = sc.nextInt();
        System.out.print("Enter the amount of large treats Barley ate: ");
        large = sc.nextInt();

        //compute happyscore
        happyscore = small + 2*medium + 3*large;

        //check for happyscore range and print if Barley is happy, sad or OK
        if (happyscore > 20) {
            System.out.print("Barley is happy!");
        } else if (happyscore < 10) {
            System.out.print("Barley is sad!");
        } else {
            System.out.print("Barley is OK.");
        }
        sc.close();
    }
}
