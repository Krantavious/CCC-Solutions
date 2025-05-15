public class MyIndexOf {
    public static void main(String[] args) {
        
    }
    public static int myIndexOf(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) return i;
        }
        return -1;
    }
    public static int myLastIndexOf(String s, char c) {
        for (int i = s.length()-1; i > -1; i--  ) {
            if (s.charAt(i) == c) return i;
        }
        return -1;
    }
}
