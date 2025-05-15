/*
	File Name: Salary.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 7, 2025
	Description: tells how much a user will make this month based on sales made
*/

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        //initialize variables
        Scanner sc = new Scanner(System.in);
        int sales;

        //prompt user for amount of sales made
        System.out.print("How many sales have you made this month?  ");
        sales = sc.nextInt();

        //check for if sales is greater than 10
        if (sales > 10) {
            System.out.print("You will make $" + (1000 + sales * 10) + " this month.");
        } else { 
            System.out.print("You will make $1000 this month.");
        }
        sc.close();
    }
}
