/*
	File Name: Timestables.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: creates timetables for all nums 1 to n X n with input n
*/	

import java.util.Scanner;

public class TimesTables {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int n;
        //prompt
        System.out.print("Enter n: ");
        n = sc.nextInt();
        //loop
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n*i);
        }
        sc.close();
    }
}
