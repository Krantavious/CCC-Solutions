/*
	File Name: Students.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: calcs avg of each test, student score, and highest student avg num
*/	

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int[] students = new int[10], tests = new int[5];
        //inputs
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Enter student %d, test %d: ", i+1, j+1);
                int input = sc.nextInt();
                students[i] += input;
                tests[j] += input;
            }
        }
        //get good index
        int gi = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Student %d has average: %.2f%n", i+1, (double)students[i]/5);
            if ((double)students[i]/5 > (double)students[gi]/5) gi = i;
        }
        //avg prints
        System.out.println("The student with the highest score is student " + (gi+1));
        for (int i = 0; i < 5; i++) {
            System.out.printf("Avg of test %d is: %.2f%n", i+1, (double)tests[i]/10);
        }
        sc.close();
    }
}
