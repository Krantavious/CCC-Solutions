import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter a string: ");
        input = sc.nextLine();
        
        System.out.printf("Char 1: %c Char 2: %c", input.charAt(0), input.charAt(input.length()-1));
        sc.close();
    }
}
