import java.util.Scanner;
import java.lang.Math;
public class q3
{
    public static void main(String[] args)
    {
        System.out.println("Enter ya height,ni**a (in cm)");
        Scanner height = new Scanner(System.in);
        double h = height.nextInt();
        double feet = h/30.5 ;
        double inc = (h%30.5)/2.54;
        System.out.println("damn, ni**a you're " + Math.floor(feet) + " feet " + inc + " inch. ");
    }
}