import java.util.Scanner;

public class Substring {
    public static void main(String[]args)
    {
        String str;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        str=in.nextLine();
        int length=str.length();
        String first;
        String last;
        first=str.substring(0,(length/2));
        if(length%2==1)
        {
            last=str.substring((length/2)+1,length);
        }
        else
        {
            last=str.substring(length/2,length);
        }
        //System.out.println(first);
        //System.out.println(last);
        if(first.equals(last))
        {
            System.out.println("first and second half are same");
        }
        else {
            System.out.println("first and second half are different");
        }

    }
}
