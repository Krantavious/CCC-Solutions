/*
	File Name: Alive.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 20, 2025
	Description: calculates days alive and hours slept based on birthday and current day
*/	

import java.util.*;

public class Alive {
    public static void main(String[] args) {
        //initialize all  variables
        Scanner sc = new Scanner(System.in);
        int yearborn, monthborn, dayborn, currentday, currentyear, currentmonth, daysalive, hoursslept;

        //prompts for brith date and stores values
        System.out.println("Enter your birthdate:");
        System.out.print("Year:   ");
        yearborn = sc.nextInt();
        System.out.print("Month:   ");
        monthborn = sc.nextInt();
        System.out.print("Day:   ");
        dayborn = sc.nextInt();

        //prompts for todays date and stores values
        System.out.println("Enter today's date:");
        System.out.print("Year:   ");
        currentyear = sc.nextInt();
        System.out.print("Month:   ");
        currentmonth = sc.nextInt();
        System.out.print("Day:   ");
        currentday = sc.nextInt();

        //calculates days alive and hours slept
        daysalive = 365*(currentyear - yearborn);
        daysalive += 30*(currentmonth - monthborn);
        daysalive += currentday - dayborn;
        hoursslept = 8*daysalive;

        //check for invalid days alive
        if (daysalive < 1) {
            System.out.println("Impossible time alive, terminating program.");
            sc.close();
            return;
        }

        //prints our days alive and hours slept
        System.out.println("You have been alive for " + daysalive + " days.");
        System.out.println("You have slept for " + hoursslept + " hours.");

        sc.close();
    }
}
