import java.util.*;
import java.io.*;
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
    student(student s)
    {
        roll = s.roll;
        name = s.name;
        score = s.score;
    } 
    public void show()
    {
        System.out.println("roll = " + roll + ", name = " + name + ", score = "+ score);
    }
} 
public class q8 {
    public static void main(String[] args) {
        student s = new student(12,"satyam",95);
        s.show();
        student sat = new student(s);
        sat.show();
    }
}