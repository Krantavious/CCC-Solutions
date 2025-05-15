/*
	File Name: Guess.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 31
	Description: prompts user to guess a number until our of bounds or correct
*/	

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        //declare variables and consts
        Scanner sc = new Scanner(System.in);
        final int CORRECT_NUM = 1;
        int currentnum;
        //prompt for first number
        System.out.print("Enter a number:  ");
        currentnum = sc.nextInt();
        //loop until invalid or correct
        while (currentnum > 0 && currentnum < 20 && currentnum != CORRECT_NUM) {
            System.out.print("Wrong, enter another number:  ");
            currentnum = sc.nextInt();
        }
        //check for if correct or out of bounds
        if (currentnum == CORRECT_NUM) {
            System.out.print("You guessed correctly!!!!!!!");
        } else {
            System.out.print("Our of bounds.");
        }
        sc.close();
    }
}
