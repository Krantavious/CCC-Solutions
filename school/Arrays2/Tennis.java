/*
	File Name: Tennis.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: stores tennis scores and prints sets won by player 1 and games won by player 2
*/	

import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int[][] games = new int[2][5];
        int sets1 = 0, gameswon2 = 0;
        //gets inputs
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter player 1's score for game " + (i+1) + ": ");
            games[0][i] = sc.nextInt();
            System.out.print("Enter player 2's score for game " + (i+1) + ": ");
            games[1][i] = sc.nextInt();
            gameswon2 += games[1][i];
            if (games[0][i] > games[1][i]) {
                sets1++;
            }
        }
        //prints
        System.out.printf("Player 1 won %d sets.%n", sets1);
        System.out.printf("Player 2 won %d games.%n", gameswon2);
        sc.close();
    }
}
