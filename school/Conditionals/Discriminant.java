/*
	File Name: Discriminant.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 17, 2025
	Description: calculates the discriminant based on a, b, c
*/	

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int a, b, c, discriminant;
        
        // prompt user for a, b, and c
        System.out.print("Enter a, b, and c in order. ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        //calculate discriminant
        discriminant = b*b - 4*a*c;

        //check for which condition is satisfied
        if (discriminant > 0) {
            System.out.print("Two real roots");
        } else if (discriminant == 0) {
            System.out.print("One real root");
        } else {
            System.out.print("No real roots");
        }
        sc.close();
    }
}
