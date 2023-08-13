import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Pairing {
    public static void main(String[]args)
    {
        int ary[];
        int a=4;
        ary=new int[a];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter four number");

        for(int j=0;j<4;j++)
        {
            ary[j]=in.nextInt();
        }
        Arrays.sort(ary);
        if(ary[0]==ary[1]&&ary[2]==ary[3])
        {
            System.out.println("two pair");
        }
        else
        {
            System.out.println("not two pair");
        }

    }
}
