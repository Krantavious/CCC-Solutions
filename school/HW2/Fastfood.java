/*
	File Name: Fastfood.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 20, 2025
	Description: calculates cost of an amount of burgers, fries, and soda, their tax, and totals, and remaining payments
*/	

import java.util.*;

public class Fastfood {
    public static void main(String[] args) {
        //initialize all variables used
        Scanner sc = new Scanner(System.in);
        int numBurgers, numFries, numSoda;
        double finalCost = 0, amountpayed;

        //prompts for number burgers, fries, and soda
        System.out.print("How many burgers?  ");
        numBurgers = sc.nextInt();
        System.out.print("How many Fries?  ");
        numFries = sc.nextInt(); 
        System.out.print("How many Soda?  ");
        numSoda = sc.nextInt();  

        //print cost (without tax), PST, GST, and total with tax
        System.out.println("Total cost (without tax) = $" + (1.69*numBurgers + 1.09*numFries + 0.99*numSoda));
        System.out.println("Cost (PST) = $" + (0.08*(1.69*numBurgers + 1.09*numFries + 0.99*numSoda)));
        System.out.println("Cost (GST) = $" + (0.05*(1.69*numBurgers + 1.09*numFries + 0.99*numSoda)));
        finalCost = 1.13*(1.69*numBurgers + 1.09*numFries + 0.99*numSoda);
        System.out.println("Final cost = " + finalCost);

        //prompt for amount payed
        System.out.println("how much has already been payed?");
        amountpayed = sc.nextDouble();
        System.out.print("$" + (finalCost - amountpayed) + " more needs to be payed");
        
        sc.close();
    }
}
