import java.util.Scanner;

public class Coupons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount $");
        double amount = scanner.nextDouble();

        double Amount = calculate(amount);

        if (Amount == 0) {
            System.out.println("No coupon");
        } else {
            System.out.println("Coupon amount: $" + Amount);
        }
    }

    public static double calculate(double amount) {
        if (amount < 10) {
            return 0;
        } else if (amount <= 60) {
            return amount * 0.08;
        } else if (amount <= 150) {
            return amount * 0.10;
        } else if (amount <= 210) {
            return amount * 0.12;
        } else {
            return amount* 0.14;
        }
    }
}
