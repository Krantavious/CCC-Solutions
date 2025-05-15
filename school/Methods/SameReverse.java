public class SameReverse {
    public static void main(String[] args) {
        System.out.print(sameReverse("ABABa"));
    }
    public static boolean sameReverse(String s) {
        final int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(i) != s.charAt(len-1-i)) return false;
        }
        return true;
    }
}
