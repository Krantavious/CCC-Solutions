/*
	File Name: AgeCheck.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 7, 2025
	Description: Asks user for their age and tells them if they can vote. If they can't, prints how many more years until they can
*/

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        //initialize variables
        Scanner sc = new Scanner(System.in);
        int age;

        //prompt user for age
        System.out.print("How old are you?  ");
        age = sc.nextInt();

        //check for if user is old enough to vote
        if (age > 17) {
            System.out.print("OLD ENOUGH TO VOTE");
        } else { // print how many years until they can vote
            System.out.print(18-age + " more years until you can vote.");
        }
        sc.close();
    }
}
