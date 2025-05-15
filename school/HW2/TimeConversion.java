/*
	File Name: TimeConversion.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 21, 2025
	Description: Takes in a number of minutes and prints the time in hour:minute format
*/	

import java.util.*;

public class TimeConversion {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int minutes, hours;

        //prompt and store minutes
        System.out.print("How many minutes? ");
        minutes = sc.nextInt();

        //perform calculations
        hours = minutes / 60;
        minutes %= 60;

        //print based on how many minutes are left to maintain hour:minute format
        if (minutes < 10) {
            System.out.print(hours + ":0" + minutes);
            sc.close();
            return;
        } else {
            System.out.print(hours + ":" + minutes);
        }
        sc.close();
    }
}
