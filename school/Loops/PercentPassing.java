/*
	File Name: PercentPassing.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 1, 2025
	Description: takes in a certain amount of scores, and determines how many are above 70. negative num to terminate
*/	

import java.util.Scanner;

public class PercentPassing {
    public static void main(String[] args) {
        //declare variables
        int totalscores = 0, above70 = 0, currentinput;
        Scanner sc = new Scanner(System.in);
        //prompt for input
        System.out.print("Enter the mark");
        currentinput = sc.nextInt();
        //continue while input is not negative
        while (currentinput > 0) {
            if (currentinput > 70) above70++;
            totalscores++;
        }
        //print
        System.out.printf("There are $d total scores, and %d scores above 70.", totalscores, above70);
        sc.close();
    }
}
