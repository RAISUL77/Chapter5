import java.util.Scanner;

public class FloatingLargest {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the three number: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();


            double max = HuntMax(num1, num2, num3);


            System.out.println("max floating point: " + max);
        }

        public static double HuntMax(double num1, double num2, double num3) {
            double max = num1;

            if (num2 > max) {
                max = num2;
            }

            if (num3 > max) {
                max = num3;
            }

            return max;
        }
    }
