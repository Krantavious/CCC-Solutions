/*
	File Name: Input_2.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: February 12, 2025
	Description: Asks for user name and says hello to them
*/	

import java.util.*;

public class Input_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name?   "); 
        String name = sc.next();
        System.out.println("Hello " + name);
        sc.close();
    }
}
