public class Square2 {
    public static void main(String[] args) {
        square(2);
        square(2, '&');
    }
    public static void square(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }
            System.out.print('\n');
        }
    }
    public static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('@');
            }
            System.out.print('\n');
        }
    }
}
