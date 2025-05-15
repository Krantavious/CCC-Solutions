/*
	File Name: Shiftup.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: shift array up by 1
*/	

import java.util.Scanner;

public class Shiftup {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[19];
        for (int i = 1; i < 20; i++) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        sc.close();
    }
}
