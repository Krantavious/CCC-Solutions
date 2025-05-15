public class PerfectSquare {
    public static void main(String[] args) {
        System.out.print(isSquare(4));
    }
    public static boolean isSquare(int n) {
        int s = 0, e = n/2+1;
        if (n == 1) return true;
        while (s != e) {
            int m = (s+e)/2;
            if (m*m == n) return true;
            if (m*m < n) {
                s = m+1;
            } else {
                e = m;
            }
        }
        return false;
    }
}
