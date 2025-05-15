/*
	File Name: Paper.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: Determines thickness and area of a paper sheet folded x amounts of times
*/	

import java.util.Scanner;

public class Paper {
    public static void main(String[] args) {
        //declare vars
        Scanner sc = new Scanner(System.in);
        int x; 
        double thickness = 0.09, area = 1.0;
        //prompt for input
        System.out.print("Enter x: ");
        x = sc.nextInt();
        //loop through folds
        for (int i = 0; i < x; i++) {
            thickness *= 2;
            area /= 2;
        }
        //print
        System.out.printf("Thickness: %.6f, Area: %.6f", thickness, area);
        sc.close();
    }
}
