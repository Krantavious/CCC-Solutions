/*
	File Name: CountInt2.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 3, 2025
	Description: counts how many ints are entered. negative to break
*/	

import java.util.Scanner;

public class CountInt2 {
    public static void main(String[] args) {
        //declare vars
        Scanner sc = new Scanner(System.in);
        int count = 0, current = 0;
        //loop while not negative
        do {
            current = sc.nextInt();
            count++;
        } while (current > 0);
        System.out.print("num of ints: " + (count-1));
        sc.close();
    }
}
