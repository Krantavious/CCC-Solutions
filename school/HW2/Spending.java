/*
	File Name: Spending.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 21, 2025
	Description: Takes the money spent on 4 different areas and prints the percentage spent on each area
*/	

import java.util.*;

public class Spending {
    public static void main (String[] args) {
        //initialize all variables
        Scanner sc = new Scanner(System.in);
        double food, clothes, entertainment, rent, total;

        //prompt and store values
        System.out.println("Enter the amount spent last month on the following item");
        System.out.print("\nFood: $");
        food = sc.nextInt();
        System.out.print("Clothes: $");
        clothes = sc.nextInt();
        System.out.print("Entertainment: $");
        entertainment = sc.nextInt();
        System.out.print("rent: $");
        rent = sc.nextInt();

        //calculate total money spent
        total = food + clothes + entertainment + rent;

        //print answer
        System.out.println("Category\tBudget");
        System.out.println("Food\t\t" + (food/total * 100) + "%");
        System.out.println("Clothing\t" + (clothes/total * 100) + "%");
        System.out.println("Entertainment\t" + (entertainment/total * 100) + "%");
        System.out.println("Rent\t\t" + (rent/total * 100) + "%");

        sc.close();
    }
}
