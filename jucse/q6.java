import java.util.Scanner;
/*public class f
{
   
}*/
public class q6
{
    public static void show(int t)
    {
        System.out.println("I'm inside the func.");
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        Short a = reader.nextShort();
        show(a);
    }
}