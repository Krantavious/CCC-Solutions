/*
	File Name: AllArrays2.java
	Name: Rich Yang 
	Class: ICS3U1-23
	Date: Apr 23, 2025
	Description: two reverse array methods
*/	

public class AllArrays2 {
    public static void main(String[] args) {
        //two methods to do them
    }
    public static int[] rvrse(int[] arr) {
        final int n = arr.length;
        int[] newarr = new int[n];
        for (int i = 0; i < n; i++) {
            newarr[i] = arr[n-1-i];
        }
        return newarr;
    }
    public static int[] rvrse2(int[] arr) {
        final int n = arr.length;
        for (int i = 0; i*2 < n; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        return arr;
    }
}
