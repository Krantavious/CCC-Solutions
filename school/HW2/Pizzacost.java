/*
	File Name: Pizzacost.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 20, 2025
	Description: takes a diameter in inches and prints the cost to make that pizza
*/	

import java.util.*;

public class Pizzacost {
    public static void main(String[] args) {
        //declare vaiables double diameter and scanner
        double diameter;
        Scanner sc = new Scanner(System.in);
        //prompts for diameter and stores it as double diameter
        System.out.println("What is the diameter of the pizza in inches?");
        diameter = sc.nextDouble();
        //prints a statement telling the user the cost of the pizza
        System.out.println("The pizza costs $" + (1.75 + 0.05*diameter*diameter) + " to make.");

        sc.close();
    }
}
