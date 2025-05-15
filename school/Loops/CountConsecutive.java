/*
	File Name: CountConsecutive.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 1, 2025
	Description: counts consecutive numbers in a list of inputs
*/	

import java.util.Scanner;

public class CountConsecutive {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int input, previnput = 0, conseccount = 0;
        //do store input, check if consec, and save prev input, while input is not 0
        do {
            input = sc.nextInt();
            if (input == previnput) conseccount++;
            previnput = input;
        } while (input != 0);
        //print conseccount
        System.out.print(conseccount);
        sc.close();
    }
}