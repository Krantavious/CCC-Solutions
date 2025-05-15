/*
	File Name: ShiftDown.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: shifts array down by 2
*/	

import java.util.Scanner;

public class ShiftDown {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
        int temp1 = arr[1], temp0 = arr[0];
        for (int i = 17; i > -1; i--) {
            arr[i] = arr[i+2];
        }
        arr[19] = temp1; arr[18] = temp0;
        sc.close();
    }
}
