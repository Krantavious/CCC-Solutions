/*
	File Name: CountOccurance.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 1, 2025
	Description: counts how many times n appears in a list of inputs, -1 to terminate
*/	

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int n, currentnum, ncount = 0;
        //store n
        System.out.print("Enter n: ");
        n = sc.nextInt();
        //do while for input and ncount increment
        do {
            currentnum = sc.nextInt();
            if (currentnum == n) ncount++;
        } while (currentnum != -1);
        System.out.print("n appears this many times: "+ncount);
        sc.close();
    }
}