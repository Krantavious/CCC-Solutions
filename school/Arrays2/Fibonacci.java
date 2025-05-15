import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n;
        System.out.print("Enter a, b, and n: ");
        a = sc.nextInt(); b = sc.nextInt(); n = sc.nextInt();
        int[] fibnums = new int[max(n, 2)];
        fibnums[0] = a;
        fibnums[1] = b;
        for (int i = 2; i < n; i++) {
            fibnums[i] = fibnums[i-1] + fibnums[i-2];
        }
        System.out.print(fibnums[n-1]);
        sc.close();
    }
    public static int max(int a, int b) {
        if (b > a) return b;
        return a;
    }
}
