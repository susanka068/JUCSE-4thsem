import java.util.Scanner;
public class q4
{
    public static void main(String[] args)
    {
        System.out.println("enter the radius");
        final double pi = 3.14;
        Scanner f = new Scanner(System.in);
        double radius = f.nextDouble();
        System.out.println("area of your circle is " + pi*radius*radius);
    }
}
