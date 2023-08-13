import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter a month (1 for January, 2 for February, etc.): ");
        int month = in.nextInt();


        int days;
        switch (month) {
            case 2:
                days = 28;
                System.out.println("February is in " + days + " days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println("Month " + month + "is in " + days + " days.");
                break;
            default:
                days = 31;
                System.out.println("Month " + month + " is in " + days + " days.");
        }
    }
}
