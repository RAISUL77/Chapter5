import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        double temp = scanner.nextDouble();

        System.out.println("Enter 'C' for Celsius or 'F' for Fahrenheit: ");
        char unit = scanner.next().charAt(0);


        if (unit == 'F' || unit == 'f') {
            temp = (temp - 32) * 5.0 / 9.0;
        }

        String State;
        if (temp <= 0) {
            State = "solid";
        } else if (temp < 100) {
            State= "liquid";
        } else {
            State = "gaseous";
        }

        System.out.println("Water is " +State + " state at " + temp + " deg celsius.");
    }
}
