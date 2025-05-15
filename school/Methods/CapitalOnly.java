public class CapitalOnly {
    public static void main(String[] args) {
        System.out.print(capitalOnly("awrdafAWdawFAefawdWAF"));
    }
    public static String capitalOnly(String s) {
        String ret = "";
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp <= 'Z' && temp >= 'A') {
                ret += temp;
            }
        }
        return ret;
    }
}
