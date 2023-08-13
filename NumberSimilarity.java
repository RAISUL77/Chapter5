import java.util.Scanner;

public class NumberSimilarity {
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the three number");
        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();
        if(a==b&&b==c)
        {
            System.out.println("all the same");
        }
        else if(a!=b&&b!=c)
        {
            System.out.println("all the different");
        }
        else
        {
            System.out.println("neither");
        }
    }
}
