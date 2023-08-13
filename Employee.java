import java.util.Scanner;

public class Employee {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.println("Hour pay: $");
            double hour_pay = scanner.nextDouble();

            System.out.println("working hour in past week: ");
            double hour_work = scanner.nextDouble();

            Paycheck paycheck = new Paycheck(name, hour_pay, hour_work);
            paycheck.printPaycheck();
        }
    }
