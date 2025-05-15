/*
	File Name: EvenNumbers.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: Counts even number based on inputs
*/	

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int numeven = 0, current;
        //do input and increment 
        do {
            System.out.print("Enter a number: ");
            current = sc.nextInt();
            if (current % 2 == 0) numeven++;
        } while (current > 0);
        //if neg num was even decrease even count
        if (current % 2 == 0) numeven--;
        System.out.print(numeven);
        sc.close();
    }
}
