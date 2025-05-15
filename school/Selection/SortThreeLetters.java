import java.util.Scanner;

public class SortThreeLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = new char[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter letter %d: ", i+1);
            letters[i] = sc.next().charAt(0);
        }

        for (char ltr : letters) {
            if (ltr > 'z' || ltr < 'a') {
                System.out.print("Out of bounds");
                sc.close();
                return;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (min(letters[0], min(letters[1], letters[2])) == letters[i]) {
                System.out.printf("%c %c %c", letters[i], min(letters[(i+1)%3], letters[(i+2)%3]), max(letters[(i+1)%3], letters[(i+2)%3]));
            }
        }
        sc.close();
    }
    public static int min(int a, int b) {
        if (b < a) return b;
        return a;
    }
    public static int max(int a, int b) {
        if (b > a) return b;
        return a;
    }
}
