/*
	File Name: Deliveroid.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 7, 2025
	Description: calculates and prints score based on packages delivered and obstacle collisions
*/

import java.util.Scanner;

public class Delivedroid {
    public static void main(String[] args) {
        //initialize variables
        Scanner sc = new Scanner(System.in);
        int delivered, collisions, points;

        //prompt user for inputs
        System.out.print("How many packages delivered?  ");
        delivered = sc.nextInt();
        System.out.print("How many obstacles collided with?  ");
        collisions = sc.nextInt();
        
        //set points to amount needed, if delivered > collisions, points increase by 500
        points = delivered*50 - collisions*10;
        if (delivered > collisions) points += 500;
        
        //print score
        System.out.print("Your score is: " + points);
        sc.close();
    }
}
