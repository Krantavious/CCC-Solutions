/*
	File Name: NumberSum.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: given a num n, sums the n inputs
*/	

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int nums, sum = 0;
        //input and loop through inputs
        nums = sc.nextInt();
        for (int i = 0; i < nums; i++) {
            sum += sc.nextInt();
        }
        //print sum
        System.out.print(sum);
        sc.close();
    }
}
