/*
	File Name: SquareCube.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: finds sum of cubes and squares from 1 to a number inputted
*/	

import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int limit, sumsquares = 0, sumcubes = 0;
        //prompt
        System.out.print("Enter upper limit: ");
        limit = sc.nextInt();
        //loop and sum
        for (int i = 1; i <= limit; i++) {
            sumsquares+=i*i;
            sumcubes+=i*i*i;
        }
        System.out.printf("Sum of squares: %d%nSum of cubes: %d", sumsquares, sumcubes);
        sc.close();
    }
}
