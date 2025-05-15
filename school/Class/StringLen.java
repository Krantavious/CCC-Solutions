import java.util.Scanner;

public class StringLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter a string: ");
        input = sc.nextLine();
        
        System.out.print("Length of string: " + input.length());
        sc.close();
    }
}
