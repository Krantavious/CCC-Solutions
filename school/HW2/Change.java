/*
	File Name: Change.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 20, 2025
	Description: prints minimum coins needed for an amount of cents
*/	

import java.util.*;

public class Change {
    //declare public variables for recursive function to use
    public static int numToonies, numLoonies, numQuaters, numDimes, numNickel, numPennies;
    public static void main(String[] args) {
        //declare private main variables
        Scanner sc = new Scanner(System.in);
        int numCents;

        //prompt user for amount of cents and store the value
        System.out.println("How many cents?");
        numCents = sc.nextInt();

        //run recursive function
        GetChange(numCents);

        //Print each val 
        System.out.println("The minimum change is:");
        System.out.println("Toonies: " + numToonies);
        System.out.println("Loonies: " + numLoonies);
        System.out.println("Quarters: " + numQuaters);
        System.out.println("Dimes: " + numDimes);
        System.out.println("Nickels: " + numNickel);
        System.out.println("Pennies: " + numPennies);

        sc.close();
    }
    
    //recursive function
    public static void GetChange(int cents) {
        //if cents is 0, end the function
        if (cents == 0) {
            return;
        // otherwise, add based on how many cents availible and recurse
        } else if (cents > 199) {
            numToonies++;
            GetChange(cents-200);
        } else if (cents > 99) {
            numLoonies++;
            GetChange(cents-100);
        } else if (cents > 24) {
            numQuaters++;
            GetChange(cents-25);
        } else if (cents > 9) {
            numDimes++;
            GetChange(cents-10);
        } else if (cents > 4) {
            numNickel++;
            GetChange(cents-5);
        } else {
            numPennies+= cents;
            return;
        }
    }
}
