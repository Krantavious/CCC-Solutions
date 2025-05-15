/*
	File Name: test.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb, 27, 2025
	Description: Prompts user for an amount in USD and converts to CAD
*/	
import java.util.*;

public class Currency {
    public static void main(String[] args) {
        //initialize constant conversion rate
        final double USD_TO_CAD = 1.8;

        //declare variables
        Scanner sc = new Scanner(System.in);
        double usd;

        //prompt and store value
        System.out.print("how much dollars USD?  ");
        usd = sc.nextDouble();

        //print using printf
        System.out.printf("You have %.2fCAD", usd*USD_TO_CAD);
        sc.close();
    }
}
