/*
	File Name: Chart.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: prints all squares, cubes and nums from a to b inclusive
*/	

import java.util.Scanner;

public class Chart {
    public static void main(String[] args) {
        //declare vars
        Scanner sc = new Scanner (System.in);
        int a, b;
        //prompt for input
        System.out.print("Enter a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        //if a > b, swap
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        //loop from a to b
        for (int i = a; i <=b; i++) {
            System.out.printf("norm %d, square %d, cube %d%n", i, i*i, i*i*i);
        }
        sc.close();
    }
}
