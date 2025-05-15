/*
	File Name: Average_New.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 3, 2025
	Description: Takes 5 integer grade values and prints the average of the grades in double
*/	

import java.util.*;

public class Average_New {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        //int[] grades = new int[5]; unecessary, but could be used to access grades again later if needed
        int total = 0;

        //loop for inputs
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter grade %d:  ", i+1);
            //grades[i] = sc.nextInt();
            total += sc.nextInt();
        }

        //print average
        System.out.printf("The average of these grades is: %.2f", (double)total / 5);
        sc.close();
    }
}
