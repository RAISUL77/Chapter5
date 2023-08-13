import java.util.Scanner;

public class FloatingPointCompare {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter the first  number: ");
        double num1 = in.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = in.nextDouble();



        boolean same = Compare(num1, num2);


        if (same) {
            System.out.println("same up to two digit");
        } else {
            System.out.println("not same up to two digit");
        }
    }

    public static boolean Compare(double num1, double num2) {

        int Num1 = (int) (num1 * 100);
        int Num2 = (int) (num2 * 100);


        return Num1 == Num2;
    }
}
