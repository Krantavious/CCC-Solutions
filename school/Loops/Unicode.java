/*
	File Name: Unicode.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 3, 2025
	Description: prints all chars from 1 to 212
*/	

public class Unicode {
    public static void main(String[] args) {
        //declare count
        int count = 1;
        System.out.println("Unicode    Char");
        //loop, print, and cast
        do {
            System.out.println(count + "          " + (char)count);
            count++;
        } while (count <= 212);
    }
}
