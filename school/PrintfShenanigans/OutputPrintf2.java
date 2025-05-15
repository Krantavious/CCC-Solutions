/*
	File Name: OutputPrintf2.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 27, 2025
	Description: prints out decimal numbers from 1.10 to 1.15 and their squares using printf
*/	

public class OutputPrintf2 {
    public static void main(String[] args) {
        System.out.println("Number        Square");
        for (double i = 1.10; i < 1.16; i += 0.01) {
            System.out.printf("%4.2f         %7.5f%n", i, i*i);
        }
    }
}
