import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }
        int secondmax = nums[0], max = nums[0];
        for (int i = 0; i < 10; i++) {
            if (nums[i] > max) {
                secondmax = max;
                max = nums[i];
            }
        }
        System.out.print("max: " + max + " 2nd max: " + secondmax);
        sc.close();
    }
}
