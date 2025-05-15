/*
	File Name: PassingScore.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: finds passing scores n stuff
*/	

import java.util.Scanner;

public class PassingScore {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        final int PASS = 60;
        double[] score = new double[15];
        boolean[] passing = new boolean[15];
        int np = 0;
        //loop for marks
        for (int i = 0; i < 15; i++) {
            System.out.printf("Enter mark %d:", i+1);
            score[i] = sc.nextDouble();
            if (score[i] > PASS) {passing[i] = true; np++;}
        }
        //print
        System.out.printf("%d passing scores", np);
        sc.close();
    }
}
