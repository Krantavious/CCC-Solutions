/*
	File Name: BoilingWAter.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 17, 2025
	Description: determines pressure given a water boiling temperature, and determines sea level based on temperature
*/	

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int pressure, waterboil;

        //prompt user for water boiling temperature
        System.out.print("At what temperature does water boil?  ");
        waterboil = sc.nextInt();

        //calculate and print pressure
        pressure = 5*waterboil - 400;
        System.out.printf("The pressure at your level is %dkPa%n", pressure);

        // conditional check for sea level
        if (waterboil > 100) {
            System.out.print("You are below sea level");
        } else if (waterboil == 100) {
            System.out.print("You are at sea level");
        } else {
            System.out.print("You are above sea level");
        }
        sc.close();
    }
}
