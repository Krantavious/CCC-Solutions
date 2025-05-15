import java.util.Scanner;

public class Stages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("How old are you? ");
        age = sc.nextInt();

        if (age > 18) {
            System.out.print("adult");
        } else if (age > 12) {
            System.out.print("teen");
        } else if (age > 10) {
            System.out.print("preteen");
        } else if (age > 5) {
            System.out.print("child");
        } else {
            System.out.print("toddler");
        }
        sc.close();
    }
}
