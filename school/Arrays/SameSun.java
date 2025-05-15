import java.util.Scanner;

public class SameSun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int[] list2 = new int[10];
        for (int i = 0; i < 10; i++) nums[i] = sc.nextInt();
        for (int i = 0; i < 10; i++) list2[i] = 25 - nums[i];
        sc.close();
    }
}
