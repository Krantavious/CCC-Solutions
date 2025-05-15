/*
	File Name: ReverseNumber.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 1, 2025
	Description: prints an input number in reverse
*/	

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int input;
        //prompt for first input
        System.out.print("Enter a number: ");
        input = sc.nextInt();
        
        printReverse(input);
        sc.close();
    }
    //recurse func for fun
    public static void printReverse(int num) {
        if (num == 0) return;
        System.out.print(num%10);
        printReverse(num/10);
    }
}
