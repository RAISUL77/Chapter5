import java.util.Scanner;

public class DigitCount {
    public static void main(String[]args)
    {
        System.out.println("Enter the number:");
        int number,digit=0;
        Scanner scanner=new Scanner(System.in);
        number= scanner.nextInt();
        if(number<0)
        {
            number=number*(-1);
        }
        if(number>0)
        {
           while(number>0)
           {
               digit++;
               number=number/10;
           }
        }
        else
        {
            digit=1;
        }
        System.out.println(digit);

    }
}
