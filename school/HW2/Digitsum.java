/*
	File Name: Digitsum.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 20, 2025
	Description: Prompts for a 3 digit number, then prints the number alongside its digit sum
*/	

import java.util.*;

public class Digitsum {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int num;
        
        //prompt for the 3 digit number
        System.out.println("Enter a 3-digit number");
        num = sc.nextInt();

        //print the number and the sum of its digits
        System.out.println("Number: " + num + "\nSum of digits: " + GetSum(num));
        sc.close();
    }

    //recursive function to get sum of digits
    public static int GetSum(int number) {
        //if input is 1 digit, return the input
        if (number < 10) {
            return number;
        } else {
            // return the right most digit of the number plus the function of the number without rightmost digit
            return number % 10 + GetSum(number/10);
        }
    }
}
