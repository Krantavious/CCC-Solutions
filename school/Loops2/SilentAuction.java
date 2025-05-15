/*
	File Name: SilentAuction.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: silent auction
*/	

import java.util.Scanner;

public class SilentAuction {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int current, highest = 0, n;
        String currentn, currenth = "";
        //loop
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            currentn = sc.next();
            current = sc.nextInt();
            if (current > highest) {currenth = currentn; highest = current;}
        }
        System.out.print(currenth);
        sc.close();
    }
}
