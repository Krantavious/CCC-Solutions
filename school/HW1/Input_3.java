/*
	File Name: Input_3.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: February 12, 2025
	Description: Asks for user name and age, asks the user a confirmation question
*/	

import java.util.*;

public class Input_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name?   ");
        String name = sc.next();
        System.out.print("What is your age?   ");
        int age = sc.nextInt();
        System.out.print("So you are " + name + " and you are " + age + "?");
        sc.close();
    }
}
