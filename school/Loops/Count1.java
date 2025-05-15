/*
	File Name: Count1.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Mar 27, 2025
	Description: prints all non-negative nums divisible 5 less than or equal than 50
*/	

public class Count1 {
    public static void main(String[] args) {
        int num = 0;
        // while the num is less than or = 50, print num and increment by 5
        while (num <= 50) {
            //print
            System.out.print(num + "\n");
            num += 5;
        }
    }
}
