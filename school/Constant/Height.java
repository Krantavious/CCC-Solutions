/*
	File Name: test.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 27, 2025
	Description: prompts user for a height in inches and converts it to cm
*/	
import java.util.*;

public class Height {
    public static void main(String[] args) {
        //initialize constant conversion rate
        final double INCH_TO_CM_CONVERSION = 2.54;

        //declare variables
        Scanner sc = new Scanner(System.in);
        int height;

        //prompt and store values
        System.out.print("How many inches tall are you?  ");
        height = sc.nextInt();

        //print using printf
        System.out.printf("You are %.3fcm tall!", height*INCH_TO_CM_CONVERSION);
        sc.close();
    }
}
