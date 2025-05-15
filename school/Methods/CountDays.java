public class CountDays {
    public static void main(String[] args) {
        System.out.print(numberOfDays(4));
    }   
    public static int numberOfDays(int month) {
        if (month == 2) return 28;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            default:
                return 30;
        }
    }
    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }
    public static int dayNumber(int year, int month, int day) {
        if (year < 0 || month > 12 || month < 0 || day > numberOfDays(month)) {
            System.out.print("Dont do that.");
            return 0;
        }
        int ans = 0;
        if (month > 2 && leapYear(year)) ans++;
        for (int i = 1; i < month; i++) {
            ans += numberOfDays(i);
        }
        ans += day;
        return ans;
    }
}
