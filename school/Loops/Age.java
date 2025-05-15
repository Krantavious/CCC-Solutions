/*
	File Name: Age.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 31, 2025
	Description: prompts user until they guess my age correctly
*/	

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        //declare variables
        final int CORRECT_AGE = 15;
        Scanner sc = new Scanner(System.in);
        int guessed;
        //prompt for first guess
        System.out.print("Guess my age: ");
        guessed = sc.nextInt();
        //continue to ask while guess is incorrect
        while (guessed != CORRECT_AGE) {
            System.out.print("Wrong, guess again: ");
            guessed = sc.nextInt();
        }
        System.out.print("Correct!!");
        sc.close();
    }
}
