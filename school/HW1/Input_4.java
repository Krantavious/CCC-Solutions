/*
	File Name: Input_4.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: February 12, 2025
	Description: Asks for two words before printing the two words in seperate lines, then in one line.
*/	

import java.util.*;

public class Input_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter word #1:   ");
        String firstword = sc.next();
        System.out.print("Please enter word #2:   ");
        String secondword = sc.next();
        System.out.print(firstword + "\n" + secondword + "\n" + firstword + " " + secondword);
        sc.close();
    }
}
