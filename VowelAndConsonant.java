import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a input");
        String input = scanner.nextLine();

        input = input.toUpperCase();

        if (input.length() != 1) {
            System.out.println("Wrong input again");
        } else {
            char character = input.charAt(0);

            if ((character >= 'A' && character <= 'Z')) {
                if (Vowel(character)) {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error occur");
            }
        }
    }
    public static boolean Vowel(char character) {
        return character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }
}
