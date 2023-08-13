import java.util.Arrays;
import java.util.Scanner;

public class Lexicography {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter three string: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();


        String[] strings = {str1, str2, str3};


        Arrays.sort(strings);
        System.out.println(strings.length);


        System.out.println("The lexicography strings are:");
        for (int i=0;i<strings.length;i++) {
            System.out.println(strings[i]);
        }
    }
}
