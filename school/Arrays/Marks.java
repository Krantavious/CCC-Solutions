
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[4];
        int[] marks = new int[4];
        for (int i = 0; i < 4; i++) {
            names[i] = sc.nextLine();
            marks[i] = sc.nextInt();
        }
        int marksearch;
        System.out.print("What mark do you want to search for? ");
        marksearch = sc.nextInt();
        for (int i = 0; i < 4; i++) {
            if (marks[i] == marksearch) {
                System.out.print(names[i]);
                sc.close();
                return;
            }
        }
        System.out.print("No one has that mark.");
        sc.close();
    }
}
