import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        //double cost;
        System.out.print("What would you like to order? \n1) juice, muffin, coffee\n2) cereal, toast, milk\n3) egg, toast, coffee\n4) banana, granola, milk\n5) grapefruit, bacon, eggs, coffee");
        input = sc.nextInt();
        switch (input) {
            case 1:
            case 2:
        }
        sc.close();
    }
}
