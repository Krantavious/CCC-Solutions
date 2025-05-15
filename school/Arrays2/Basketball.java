/*
	File Name: Basketball.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: calcs tot score for 2 teams and games won
*/	

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][5];
        int tscore1 = 0, tscore2 = 0, gw1 = 0, gw2 = 0;
        //inputs
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter team 1 game %d score: ", i+1);
            arr[0][i] = sc.nextInt();
            tscore1 += arr[0][i];
        }
        //inputs2 with counting games won and tot score
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter team 2 game %d score: ", i+1);
            arr[1][i] = sc.nextInt();
            tscore2 += arr[1][i];
            if (arr[1][i] > arr[0][i]) gw2++; else if (arr[0][i] > arr[1][i]) gw1++;
        }
        //print
        System.out.printf("Team 1 scored %d points, Team 2 scored %d points %n", tscore1, tscore2);
        System.out.printf("Team 1 won %d games, Team 2 won %d games.", gw1, gw2);
        sc.close();
    }
}
