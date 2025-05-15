/*
	File Name: HW2_Output3.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: February 8, 2025
	Description: Prints the following:
    Num^^^Square
    ***^^^******
    1     1
    2     4
    3     9
    4     16
    5     25
    >
    1*1=1
    2*2=4
    3*3=9
    4*4=16
*/

public class HW2_Output3 {
    public static void main(String[] args) {
        System.out.println("Num\tSquare\n***\t******");
        for (int i = 1; i < 6; ++i) {
            System.out.println(i + "\t" + i*i);
        }
        System.out.println("");
        for (int i = 1; i < 5; ++i) {
            System.out.println(i + "*" + i + "=" + i*i);
        }
    }
}
