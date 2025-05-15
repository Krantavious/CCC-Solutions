public class NoVowels {
    public static void main(String[] args) {
        System.out.print(noVowels("waihfuigheah"));
    }
    public static String noVowels(String s) {
        String ret = "", vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) == -1) {
                ret += s.charAt(i);
            }
        }
        return ret;
    }
}
