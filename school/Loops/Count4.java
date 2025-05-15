/*
	File Name: Count4.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 27, 2025
	Description: inputs a and b and prints all nums between a and b inclusive
*/	

import java.util.Scanner;

public class Count4 {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int a, b, num;
        
        //prompt and input for a and b
        System.out.print("Enter a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();

        //set num to min of a and b
        num = min(a, b);
        
        //while num in range of a and b, print and increment
        while (num <= max(a, b)) {
            System.out.println(num);
            num++;
        }
        sc.close();
    }
    //min method
    public static int min(int num1, int num2) {
        if (num2 < num1) return num2;
        return num1;
    }
    //max method
    public static int max(int num1, int num2) {
        if (num2 > num1) return num2;
        return num1;
    }
}
