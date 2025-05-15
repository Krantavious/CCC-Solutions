/*
	File Name: Test.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 19, 2025
	Description: prompts for a mark and checks if the mark is passing or not
*/	

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //declare variables 
        final int PASS_MARK = 50;
        Scanner sc = new Scanner(System.in);
        int mark;

        //prompt for input
        System.out.print("Enter the mark: ");
        mark = sc.nextInt();

        //check mark for out of range, failing, or passing
        if (mark > 100 || mark < 0) {
            System.out.print("Invalid mark.");
        } else if (mark < PASS_MARK) {
            System.out.print("The student is failing.");
        } else {
            System.out.print("The student is passing.");
        }
        sc.close();
    }
}
