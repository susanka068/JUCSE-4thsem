import java.util.Scanner;
public class q5
{
    public static void main(String[] args)
    {
        Scanner head = new Scanner(System.in);
        String s1 = head.nextLine();
        String s2 = s1;
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}