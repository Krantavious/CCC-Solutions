/*
	File Name: Drop.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 20, 2025
	Description: intakes a time and prints the height of a ball falling from 100m at that time
*/	

import java.util.*;

public class Drop {
    public static void main(String[] args) {
        //declare variable double time and scanner
        double time;
        Scanner sc = new Scanner(System.in);
        //prompt user for a time in seconds and store it as double time
        System.out.println("Input a time in seconds that is less than 4.5");
        time = sc.nextDouble();
        //check if time is invalid
        if (time >= 4.5) {
            //print invalid and end
            System.out.println("Invalid time");
            sc.close();
            return;
        } else {
            //print the height
            System.out.println("The height of the ball is " + (100 - 4.9*time*time));
        }
        sc.close();
    }
}
