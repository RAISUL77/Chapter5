import java.util.Scanner;

public class Ordering {

    public static void main(String[]args)
    {
        int a,b,c;
        System.out.println("enter the three number");
        Scanner in=new Scanner(System.in);
        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();
        if(a<=b&&b<=c)
        {
            System.out.println("in order");
        }
        else if(a>=b&&b>=c)
        {
            System.out.println("in order");
        }
        else
        {
            System.out.println(" not in order");
        }
    }
}
