/*
	File Name: Factors.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: calcs all factors of a given num
*/	

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        //loop and check divisibility
        for (int i = 1; i*i <= input; i++) {
            if (input % i == 0) System.out.println("Factor pair: " + i + ", "+(input/i));
        }
        sc.close();
    }
    //sqrt func
    public static int sqrt(int num) {
        int s = 1, e = num;
        while (s != e) {
            int m = (s+e)/2;
            if (m*m > num) {
                e = m;
            } else {
                s = m+1;
            }
        }
        return s-1;
    }
}
