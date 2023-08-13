import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number: ");


        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        double actual_value = Math.abs(number);
        if (actual_value < 1) {
            System.out.println("small");
        } else if (actual_value > 1000000) {
            System.out.println("large");
        }
    }
}
