/*
	File Name: TournamentSelection.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 19, 2025
	Description: takes in 6 lines of input of W or L, and determines whether the player is in group 1, 2, 3, or eliminated
*/	

import java.util.Scanner;

public class TournamentSelection {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int wins = 0;
        char input;

        //loop for inputs
        for (int i = 0; i < 6; i++) {
            input = sc.next().charAt(0);
            if (input == 'W') {
                wins++;
            }
        }

        //check which group the player belongs in, or if the player is eliminated
        if (wins > 4) {
            System.out.print("Group 1");
        } else if (wins > 2) {
            System.out.print("Group 2");
        } else if (wins > 0) {
            System.out.print("Group 1");
        } else {
            System.out.print("Eliminated.");
        }
        sc.close();
    }
}
