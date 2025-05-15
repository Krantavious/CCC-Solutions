/*
	File Name: Award.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 17, 2025
	Description: Stores letter grade for each of 4 essays and determines if the student gets a distinction, participation, or NOTHING!
*/	

import java.util.Scanner;

public class Award {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        char[] essays = new char[4];
        int score = 0;

        //loop with printf to prompt and store inputs
        for (int i = 1; i < 5; i++) {
            System.out.printf("What grade did essay %d get? ", i);
            essays[i-1] = sc.next().charAt(0);
        }
        //for every element in essays, increase score based on grade
        for (char grade : essays) {
            if (grade == 'A') {
                score += 3;
            } else if (grade == 'B') {
                score += 2;
            } else if (grade == 'C') {
                score += 1;
            }
        }
        
        //determine student distinction, participation, or nothing.
        if (score > 7) {
            System.out.print("You get a distinction award!!!");
        } else if (score == 0) {
            System.out.print("You get nothing . . .");
        } else {
            System.out.print("You get a participation award.");
        }
        sc.close();
    }
}
