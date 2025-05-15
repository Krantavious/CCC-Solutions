public class Reverse2 {
    public static void main(String[] args) {
        System.out.print(reverse("WOWZERS"));
    }
    public static String reverse(String s) {
        String ret = "";
        for (int i = s.length()-1; i > -1; i--) {
            ret += s.charAt(i);
        }
        return ret;
    }
}
