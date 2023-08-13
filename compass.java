import java.util.Scanner;

public class compass {
    public static void main(String[]args)
    {
        int angle;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the angle");
        angle=in.nextInt();
        String direction[]={"N", "NE", "E", "SE", "S", "SW", "W","NW"};
        int Angles[] = {0, 45, 90, 135, 180, 225, 270, 315};
        angle=((angle%360)+360)%360;
        int result=0;
        int near=Math.abs((angle-Angles[0]));
        for (int i = 1; i <Angles.length; i++) {
            int difference = Math.abs(angle -Angles[i]);
            if (difference < near) {
                near= difference;
                result= i;
            }
        }
        System.out.println("the nearest principal direction:"+direction[result]);
    }
}
