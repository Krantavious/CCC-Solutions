/*
	File Name: Quadrant.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 19, 2025
	Description: prompts for an x and y position and determines which quadrant the point lies in
*/	

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int x, y;

        //prompt for x and y
        System.out.print("Enter the x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter the y coordinate: ");
        y = sc.nextInt();

        //test for which quadrant
        if (x < 0) {
            if (y < 0) {
                System.out.print("Quadrant 3.");
            } else {
                System.out.print("Quadrant 2.");
            }
        } else {
            if (y < 0) {
                System.out.print("Quadrant 4.");
            } else {
                System.out.print("Quadrant 1.");
            }
        }
        sc.close();
    }
}
