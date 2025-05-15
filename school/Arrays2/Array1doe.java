/*
	File Name: Array1doe.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: checks if all nums are even, odd, or none
*/	

import java.util.Scanner;

public class Array1doe {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        //input array nums
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        //if all nums have same parity
        if (isall(arr)) {
            if (arr[0] % 2 == 0) { // if nums are even
                System.out.print("All nums are even");
            } else { //else nums are odd
                System.out.print("All nums are odd");
            }
        } else {
            System.out.print("Not all nums have the same parity");
        }
        sc.close();
    }
    //check if all nums are same parity
    public static boolean isall(int[] nums) {
        for (final int i : nums) {
            if (i % 2 != nums[0] % 2) return false;
        }
        return true;
    }
}
