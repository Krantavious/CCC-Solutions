import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextDouble();
        }
        for (int i = 5; i > -1; i--) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < 6; i++) {
            arr[i] *= 1.1;
        }
        for (final double d : arr) {
            if (d > 50) System.out.println(d);
        }
        sc.close();
    }
}
