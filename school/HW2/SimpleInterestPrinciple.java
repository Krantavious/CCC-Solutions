/*
	File Name: SimpleInterestAmount.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 24, 2025
	Description: Takes in interest rate, amount desired, and years held and prints amount required to invest to recieve amount desired 
*/	

import java.util.*;

public class SimpleInterestPrinciple {
    public static void main(String[] args) {
        //Declare variables
        Scanner sc = new Scanner(System.in);
        double interest;
        int amount, years;

        //prompt for values and store
        System.out.println("enter the interest, amount desired, and years");
        interest = sc.nextDouble()/100;
        amount = sc.nextInt();
        years = sc.nextInt();

        //print amount needed
        System.out.print("Amount needed for amount desired: " + (amount / (1 + years * interest)));

        sc.close();
    }
}
