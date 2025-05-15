/*
	File Name: Array2doe.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: prints rows and cols that all are odd or even
*/	

import java.util.Scanner;

public class Array2doe {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //inputs
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //check if row or col is all even or odd
        for (int i = 0; i < 3; i++) {
            if (arr[i][0] % 2 == arr[i][1] % 2 && arr[i][2] % 2 == arr[i][1] % 2) {
                if (arr[i][0] % 2 == 0) {
                    System.out.printf("Row %d is all even", i+1);
                } else {
                    System.out.printf("Row %d is all odd", i+1);
                }
            }
            if (arr[0][i] % 2 == arr[1][i] % 2 && arr[2][i] % 2 == arr[1][i] % 2) {
                if (arr[0][i] % 2 == 0) {
                    System.out.printf("Col %d is all even", i+1);
                } else {
                    System.out.printf("Col %d is all odd", i+1);
                }
            }
        }
        sc.close();
    }
}
