import java.util.Scanner;

public class GradeConvert {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the result: ");
        double result = scanner.nextDouble();


        String Grade = getLetterGrade(result);


        System.out.println(" grade " +Grade);
    }


    public static String getLetterGrade(double result) {
        if (result < 0 || result > 4) {
            return "ERROR";
        }


        if (result >= 3.85) {
            return "A";
        } else if (result >= 3.5) {
            return "A-";
        } else if (result>= 2.85) {
            return "B+";
        } else if (result>= 2.5) {
            return "B";
        } else if (result>= 1.85) {
            return "B-";
        } else if (result >= 1.5) {
            return "C+";
        } else if (result>= 0.85) {
            return "C";
        } else {
            return "C-";
        }
    }
}
