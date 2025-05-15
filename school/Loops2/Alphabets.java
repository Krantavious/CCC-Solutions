/*
	File Name: Alphabets.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 7, 2025
	Description: determines caps, lowers, and vowels given inputs
*/	

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        //vars
        final int temp = 'a'-'A';
        Scanner sc = new Scanner(System.in);
        char current;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int numlower = 0, numcaps = 0, numvowels = 0;
        //input and loop
        current = sc.next().charAt(0);
        while (inrange('a', current, 'z') || inrange('A', current, 'Z')) {
            if (inrange('a', current, 'z')) numlower++;
            if (inrange('A', current, 'Z')) numcaps++;
            for (char k : vowels) {
                if (current == k || current == k-temp) numvowels++;
            }
            current = sc.next().charAt(0);
        }
        //print
        System.out.printf("Lowers: %d, Caps: %d, Vowels: %d", numlower, numcaps, numvowels);
        sc.close();
    }
    //inrange func
    public static boolean inrange(int a, int b, int c) {
        if (b >= a && b <= c) return true;
        return false;
    }
}
