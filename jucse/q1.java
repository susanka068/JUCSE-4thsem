import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class q1
{
    public static void main(String[] args)
    {
       Scanner reader = new Scanner(System.in);
       int a = reader.nextInt();
       Scanner dead = new Scanner(System.in);
       int b = dead.nextInt();
       int c = a + b ;
       System.out.println(c);
    }
}
