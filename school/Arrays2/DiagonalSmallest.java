/*
	File Name: DiagonalSmallest.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: finds smallest num in each diagonal
*/	

import java.util.Scanner;

public class DiagonalSmallest {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int smallest1, smallest2;
        //store input
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        smallest1 = arr[0][0];
        smallest2 = arr[3][0];
        //store min
        for (int i = 0; i < 4; i++) {
            smallest1 = min(smallest1, arr[i][i]);
            smallest2 = min(smallest2, arr[3-i][i]);
        }
        System.out.print("Smallest in diagonals: " + smallest1 + " " + smallest2);
        sc.close();
    }
    //min func
    public static int min(int a, int b) {
        if (b < a) return b;
        return a;
    }
}
