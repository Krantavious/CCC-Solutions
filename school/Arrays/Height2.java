import java.util.Scanner;

public class Height2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg = 0;
        double[] heights = new double[20];
        for (int i = 0; i < 20; i++) {
            heights[i] = sc.nextDouble();
            avg += heights[i];
        }
        avg /= 20;
        for (final double d : heights) {
            if (d > avg) System.out.println(d);
        }
        sc.close();
    }
}
