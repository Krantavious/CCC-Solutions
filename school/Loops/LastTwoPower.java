/*
	File Name: LastTwoPower.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 1, 2025
	Description: calculates the smallest power of two greater than an input
*/	

import java.util.Scanner;

public class LastTwoPower {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int input, count = 1;
        //prompt for first input
        System.out.print("Enter a number: ");
        input = sc.nextInt();
        //loop until count is greater
        while (count <= input) {
            count*=2;
        }
        //print ans
        System.out.print("The smallest power of two GREATER than your input is: " + count);
        sc.close();
    }
}
