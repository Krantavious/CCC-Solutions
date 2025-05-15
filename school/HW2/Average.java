/*
	File Name: Average.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 20, 2025
	Description: takes the average of 3 doubles and prints their average
*/	

import java.util.*;

public class Average {
    public static void main (String[] args) {
        //declare all double variables and scanner
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        //take 3 num values and store them in 3 variables
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        //print average
        System.out.println("The average is " + (num1 + num2 + num3)/3);
        sc.close();
    }
}
