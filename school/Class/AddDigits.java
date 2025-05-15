import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int sum = 0;

        System.out.print("Enter a num: ");
        str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.print(sum);
        sc.close();
    }
}
