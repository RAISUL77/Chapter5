import java.util.Scanner;

public class FirstAndLastCharacter {
            public static void main(String[]args)
            {
                String str;
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the string");
                str=input.nextLine();
                int length=str.length();
                System.out.println(length);
                char first,last;
                first=str.charAt(0);
                last=str.charAt(length-1);
                if(first==last)
                {
                    System.out.println("first and last letter same");
                }
                else
                {
                    System.out.println(" first and last letter differance");
                }
            }

    }

