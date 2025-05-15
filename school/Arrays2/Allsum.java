/*
	File Name: Allsum.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: sums elements in array
*/	

public class Allsum {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
{1, 4, 4, 8, 13},
{9, 1, 0, 2},
{0, 2, 6, 4, -1, -8}};
        int sum = 0;
        for (final int[] arr : data) {
            for (final int i : arr) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
