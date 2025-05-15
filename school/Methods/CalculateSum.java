public class CalculateSum {
    public static void main(String[] args) {
        
    }
    public static int sumRange(int a, int b) {
        if (b < a) return 0;
        int ret = 0;
        for (int i = a; i <= b; i++) {
            ret += i;
        }
        return ret;
    }
}
