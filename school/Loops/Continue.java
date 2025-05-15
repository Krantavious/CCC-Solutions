/*
	File Name: Continue.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 3, 2025
	Description: continues while the user wants to continue
*/	

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        //declare vars
        Scanner sc = new Scanner(System.in);
        char currentchar;
        //continue while char is y
        do {
            System.out.print("Continue? Respond with y or n  ");
            currentchar = sc.next().charAt(0);
        } while (currentchar == 'y');
        sc.close();
    }
}
