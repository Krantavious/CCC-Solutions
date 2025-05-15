import java.util.Scanner;

public class StarTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.print("Enter m: ");
        m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (char[] a : arr) {
            for (char c : a) {
                c = '*';
                System.out.print(c);
            }
            System.out.print('\n');
        }
        sc.close();
        
    }
}
