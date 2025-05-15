/*
	File Name: AllArrays.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: does mark shenanigans
*/	

import java.util.Scanner;

public class AllArrays3 {
    public static void main(String[] args) {
        //vars
        int numtests, numstudents;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many tests? ");
        numtests = sc.nextInt();
        System.out.print("How many students? ");
        numstudents = sc.nextInt();
        double[] studmark = new double[numstudents];
        //get marks
        for (int i = 0; i < numstudents; i++) {
            for (int j = 0; j < numtests; j++) {
                System.out.printf("Enter student %d's test mark %d: ", i+1, j+1);
                studmark[i] += sc.nextDouble();
            }
        }
        //get best mark and avg
        int bestmark = 0;
        double totalavg = 0;
        for (int i = 0; i < numstudents; i++) {
            studmark[i] /= numtests;
            totalavg += studmark[i];
            System.out.printf("Student %d has avg mark %.2f%n", i+1, studmark[i]);
            if (studmark[i] > studmark[bestmark]) bestmark = i;
        }
        totalavg /= numstudents;
        System.out.println("Student " + (bestmark+1) + " has the best avg.");
        //find above avg students
        for (int i = 0; i < numstudents; i++) {
            if (studmark[i]  > totalavg) System.out.printf("Student %d has an above avg mark", i+1);
        }
        sc.close();
    }
}
