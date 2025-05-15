/*
	File Name: Pass.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 7, 2025
	Description: asks a math problem: 36591 + 4492, and checks if the user enters the right answer
*/

import java.util.*;

public class Pass {
    public static void main(String[] args) {
        // initialize variables
        Scanner sc = new Scanner(System.in);
        int input;

        //prompt user for answer
        System.out.print("What is 36591 + 4492?");
        input = sc.nextInt();

        // check input 
        if (input == 41083) {
            System.out.print("That is correct!");
        } else {
            System.out.print("That is incorrect!");
        }
        sc.close();
    }
}
