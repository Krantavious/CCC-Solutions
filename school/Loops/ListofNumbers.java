import java.util.Scanner;

public class ListofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int evennums = 0, oddnums = 0, input = 0;
        while (input != -1) {
            input = sc.nextInt();
            if (input % 2 == 0) {
                evennums++;
            } else {
                oddnums++;
            }
        }
        System.out.printf("Num odd nums: %d%nNum even nums: %d%nTotal nums: %d", oddnums-1, evennums, evennums+oddnums-1);
        sc.close();
    }
}
