/*
	File Name: CheckInt.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 17, 2025
	Description: checks an integer for positive or negative, even or odd, and divisible by 7
*/	

import java.util.Scanner;

public class CheckInt {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int integer;

        //prompt user for input
        System.out.print("Enter and integer: ");
        integer = sc.nextInt();

        //conditional check for positive, negative, or zero
        if (integer < 0) {
            System.out.println("The number is negative.");
        } else if (integer > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
        //check for even or odd
        if (integer % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        //check for multiple of 7
        if (integer % 7 == 0) {
            System.out.println("The number is a multiple of 7.");
        } else {
            System.out.println("The number is not a multiple of 7.");
        }
        sc.close();
    }
}
