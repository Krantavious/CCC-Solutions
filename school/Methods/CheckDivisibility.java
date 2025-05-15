public class CheckDivisibility {
    public static void main(String[] args) {
        
    }
    public static boolean evenlyDivisible(int n, int d) {
        if (n == 0 || d == 0) return false;
        return (n % d == 0);
    }
}
