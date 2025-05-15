/*
	File Name: Limit.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: sums all nums 1/k where k spans from 1 to n. n is inputted
*/	

import java.util.Scanner;

public class Limit {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;
        //input and loop
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        //print
        System.out.printf("%.6f", sum);
        sc.close();
    }
}
