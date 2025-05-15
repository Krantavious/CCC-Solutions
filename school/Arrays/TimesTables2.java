public class TimesTables2 {
    public static void main(String[] args) {
        int[][] arr = new int[12][12];
        for (int i = 1; i < 12+1; i++) {
            for (int j = 1; j < 12+1; j++) {
                arr[i-1][j-1] = i*j;
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.print('\n');
        }
    }
}
