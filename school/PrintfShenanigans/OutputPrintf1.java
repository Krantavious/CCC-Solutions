/*
	File Name: OutputPrintf1.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Feb 27, 2025
	Description: Prints two statements of name with balance using printf
*/	

public class OutputPrintf1 {
    public static void main(String[] args) {
        //String name = "name";
        //double balance = 0;
        System.out.printf("%8s's bank account balance is $%,12.2f%n", "Juanita", 2345678.99);
        System.out.printf("%8s's bank account balance is $%,12.2f", "Juan", 15455.26);
    }
}
