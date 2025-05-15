/*
	File Name: Energy.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 21, 2025
	Description: asks for a mass, then prints the energy of that mass and how much lightbulbs that could be powered by it
*/	

import java.util.*;

public class Energy {
    public static void main (String[] args) {
        //variable declaration
        Scanner sc = new Scanner(System.in);
        int kilos;
        // m/4 * 10*12 | equation for lightbulbs powered for one hour

        //prompt for mass and store input
        System.out.print("What is the mass in kilos?  ");
        kilos = sc.nextInt();

        //print energy created and how many lightbulbs that could be powered
        System.out.println("Energy created: " + (kilos * 9 * 1e16));
        System.out.print("Lightbulbs that could be powered for an hour: " + (kilos * 1e12 / 4));
        sc.close();
    }   
}
