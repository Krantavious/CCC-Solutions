/*
	File Name: CarRental.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: car rentals and stuff
*/	

import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        //vars
        Scanner sc = new Scanner(System.in);
        int[] sn = new int[10], m = new int[10];
        char[] t = new char[10];
        double avg = 0;
        //inputs
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter Serial num for car %d: ", i+1);
            sn[i] = sc.nextInt();
            System.out.printf("Enter Mileage for car %d: ", i+1);
            m[i] = sc.nextInt();
            avg += m[i];
            System.out.printf("Enter Type num for car %d: ", i+1);
            t[i] = sc.next().charAt(0);
        }
        //avg and mileage prints
        avg /= 10;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Snum: %d Mileage over avg: %.2f%n", sn[i], m[i]/avg);
        }
        //type and prints
        System.out.println("Enter a type: ");
        char temp = sc.next().charAt(0);
        for (int i = 0; i < 10; i++) {
            if (t[i] == temp) System.out.println(sn[i]);
        }
        sc.close();
    }
}
