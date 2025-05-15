/*
	File Name: SumDigit.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 1, 2025
	Description: prints digit sum
*/	

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int input;
        //prompt input
        System.out.print("Enter a number: ");
        input = sc.nextInt();

        //print digit sum
        System.out.print(GetSum(input));
        sc.close();
    }
    //recursive function to get sum of digits
    public static int GetSum(int number) {
        //if input is 1 digit, return the input
        if (number < 10) return number;
        // return the right most digit of the number plus the function of the number without rightmost digit
        return number % 10 + GetSum(number/10);

    }
}
