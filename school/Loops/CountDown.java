/*
	File Name: CountDown.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 3, 2025
	Description: counts down from 100 by 2s
*/	

public class CountDown {
    public static void main(String[] args) {
        //declare count
        int count = 100;
        //count down by 2s
        do {
            System.out.println(count);
            count -= 2;
        } while (count > 0);
    }
}
