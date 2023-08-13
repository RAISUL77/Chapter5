import java.util.Scanner;

public class SortOder {
    public static void main(String[]args)
    {
        int a,b,c;
        System.out.println("enter the three number");
        Scanner in=new Scanner(System.in);
        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();
        if(a<b&&b<c)
        {
            System.out.println("increasing");
        }
        else if(a>b&&b>c)
        {
            System.out.println("decreasing");
        }
        else
        {
            System.out.println("neither");
        }
    }
}
