/*
	File Name: Cost.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 27, 2025
	Description: prompts user for cost and prints the amount the item costs with HST
*/	

import java.util.*;

public class Cost {
    public static void main(String[] args) {
        //initialize constant for HST
        final double HST = 1.13;

        //declare variables
        Scanner sc = new Scanner(System.in);
        double cost;

        //prompt and store value for cost
        System.out.print("How much does the item cost?  ");
        cost = sc.nextDouble();

        //print total cost and HST for the item
        System.out.printf("Your item costs $%.2f in total, with $%.2f in taxes", cost*HST, cost*(HST-1));
        sc.close();
    }
}
