import java.io.*;
import java.util.*;
class student
{
    int roll;
    String name ;
    int score;
    public student(int roll,String name,int score)
    {
        this.roll = roll ;
        this.name = name ;
        this.score = score ;
    }
    public void show()
    {
        System.out.println("roll = " + roll + ", name = " + name + ", score = "+ score);
    }
} 
public class q7
{
    public static void main(String[] args)
    {
        student s = new student(12,"satyam",95);
        s.show();
    }
}