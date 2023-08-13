import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter a letter grade: ");
        String result = in.nextLine();



        double numeric_value = getNumericGrade(result);


        System.out.println("Grade value is " + numeric_value);
    }

    public static double getNumericGrade(String result) {
        switch (result) {
            case "A+":
                return 4.0;
            case "A":
                return 3.7;
            case "A-":
                return 3.4;
            case "B":
                return 3.0;
            case "B+":
                return 3.3;
            case "B-":
                return 2.7;
            case "C":
                return 2.0;
            case "C+":
                return 2.3;
            case "C-":
                return 1.7;
            case "D":
                return 1.0;
            case "D+":
                return 1.3;
            case "D-":
                return 0.7;
            case "F":
                return 0.0;
            default:
                System.out.println("Error");
                return -1.0;
        }
    }
}
