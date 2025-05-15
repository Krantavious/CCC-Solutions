/*
	File Name: Backward2.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: inputs and loops down by 5 from that num
*/	

import java.util.Scanner;

public class Backward2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        //prompt for input
        System.out.print("Enter a num from 100 to 50: ");
        input = sc.nextInt();
        sc.close();
        //loop
        for (int i = 100; i >= input; i -=5) {
            System.out.println(i);
        }
    }
}
