/*
	File Name: Delivery.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 21, 2025
	Description: asks for package weight and dimensions and determines cost, or if the item is too large or heavy
*/	

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double weight, height, length, width, price = 0;

        //prompt for input
        System.out.print("How much does the package weigh? ");
        weight = sc.nextDouble();
        System.out.print("Enter the dimensions in cm: \n");
        height = sc.nextDouble();
        length = sc.nextDouble();
        width = sc.nextDouble();
        //check for too large or heavy
        if (height * length * width > 100000) {
            System.out.print("Too large");
        } else if (weight > 27) {
            System.out.print("Too heavy");
        } else {
            //check what range 
            if (weight > 20) {
                price = 4.5*weight;
            } else if (weight > 12) {
                price = 4*weight;
            } else if (weight > 5) {
                price = 3.5*weight;
            } else {
                price = 3*weight;
            }
        }
        //print answer
        System.out.printf("Your item is $%.2f", price);
        sc.close();
    }
}
