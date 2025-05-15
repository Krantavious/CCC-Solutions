/*
	File Name: AllArrays1.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: does stuff
*/	

import java.util.Scanner;

public class AllArrays1 {
    public static void main(String[] args) {
        //vars
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        //actions n stuff
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = 1;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter num %d", i+1);
            arr[i] = sc.nextInt();
        }
        int temp = arr[n-1];
        arr[n-1] = arr[0];
        arr[0] = temp;
        for (int i = 0; i < n; i++) if (arr[1] < 0) arr[i] = -arr[i];
        int samplesum = 0;
        for (int i = 0; i < n; i++) {
            samplesum += arr[i];
            if (arr[i] % 2 == 0) System.out.println(arr[i]);
        }
        System.out.print(samplesum);
        sc.close();
    }
}
