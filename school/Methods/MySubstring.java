public class MySubstring {
    public static void main(String[] args) {
        
    }
    public static String mySubstring(String str, int s, int e) {
        String ret = "";
        for (int i = s; i < e; i++) {
            ret += str.charAt(i);
        }
        return ret;
    }
    public static String mySubstring(String str, int s) {
        String ret = "";
        for (int i = s; i < str.length(); i++) {
            ret += str.charAt(i);
        }
        return ret;
    }
}
