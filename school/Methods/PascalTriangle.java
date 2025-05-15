public class PascalTriangle {
    public static void main(String[] args) {
        pascalTriangle(14);
        int[] b = {0};
    }
    public static void pascalTriangle(int n) {
        int[][] psclT = new int[n][];
        for (int i = 0; i < n; i++) {
            psclT[i]= new int[i+1];
            psclT[i][0] = 1; psclT[i][i] = 1;
            for (int j = 1; j < i; j++) {
                psclT[i][j] = psclT[i-1][j] + psclT[i-1][j-1];
            }
        }
        for (final int[] temp : psclT) {
            for (final int i : temp) {
                System.out.print(i + " ");
            }
            System.out.print('\n');
        }
    }
}
