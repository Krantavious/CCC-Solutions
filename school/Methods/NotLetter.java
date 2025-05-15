public class NotLetter {
    public static void main(String[] args) {
        System.out.print(notLetter('1'));
    }
    public static boolean notLetter(char c) {
        return (boolean)((c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A'));
    }
}
