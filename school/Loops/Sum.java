/*
	File Name: Sum.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 3, 2025
	Description: takes sum of all numbers inputed until a negative value
*/	

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //declare vars
        Scanner sc = new Scanner(System.in);
        int input, sum = 0;
        //do input while input is not negative
        do {
            input = sc.nextInt();
            sum += input;
        } while (input > 0);
        //print sum minus previous negative input
        System.out.print(sum-input);
        sc.close();
    }
}
