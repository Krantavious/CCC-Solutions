/*
	File Name: SimpleInterestAmount.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 24, 2025
	Description: Takes in interest rate, amount, and years held and calculates simply
*/	

import java.util.*;

public class SimpleInterestAmount {
    public static void main(String[] args) {
        //Declare variables
        Scanner sc = new Scanner(System.in);
        double interest;
        int amount, years;

        //prompt for values and store
        System.out.println("enter the interest, principle, and years");
        interest = sc.nextDouble()/100;
        amount = sc.nextInt();
        years = sc.nextInt();

        //print end amount
        System.out.print("Amount after years and interest: " + (amount * (1 + years * interest)));

        sc.close();
    }
}
