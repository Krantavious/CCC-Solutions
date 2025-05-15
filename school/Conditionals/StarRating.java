/*
	File Name: StarRating.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 17, 2025
	Description: prompts user for points scored and fouls and determines if they are a gold star
*/	

import java.util.Scanner;

public class StarRating {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int score, fouls;

        //prompt user for input
        System.out.print("How many points scored?  ");
        score = sc.nextInt();
        System.out.print("How many fouls?  ");
        fouls = sc.nextInt();

        //conditional statement
        if (5*score - 3*fouls > 40) {
            System.out.print("The player is a Gold Star!");
        } else {
            System.out.print("The player is NOT a Gold Star!");
        }
        sc.close();
    }
}
