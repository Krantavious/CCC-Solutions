/*
	File Name: Temperature.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 19, 2025
	Description: takes a temperature and determines what range it falls in
*/	

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int temp;

        //prompt user for input
        System.out.print("Enter the temperature: ");
        temp = sc.nextInt();

        //check for what range
        if (temp < -18) {
            System.out.print("very cold");
        } else if (temp < 0) {
            System.out.print("cold");
        } else if (temp == 0) {
            System.out.print("freezing point of water");
        } else if (temp <= 10) {
            System.out.print("very cool");
        } else if (temp <= 20) {
            System.out.print("moderate");
        } else if (temp <= 30) {
            System.out.print("warm");
        } else if (temp <= 40) {
            System.out.print("hot");
        } else if (temp < 100) {
            System.out.print("extremely hot");
        } else if (temp == 100) {
            System.out.print("boiling point of water");
        }
        sc.close();
    }
}
