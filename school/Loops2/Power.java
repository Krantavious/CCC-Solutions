/*
	File Name: Power.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: calculates x^n
*/	

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        double x, total = 1;
        int n;
        //prompt
        System.out.print("Enter x and n: ");
        x = sc.nextDouble();
        n = sc.nextInt();
        //check invalid
        if (n < 0) {
            System.out.println("n must be positive");
            sc.close();
            return;
        } else {
            //loop
            for (int i = 0; i < n; i++) {
                total *= x;
            }
        }
        //print
        System.out.println("x to the n is: "+ total);
        sc.close();
    }   
}
