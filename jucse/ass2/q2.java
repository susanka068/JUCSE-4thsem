import java.io.*;
import java.util.*;
class address{
    int premise,pin;
    String street , city , state ;
    public address(int premise,String street,String city,int pin,String state)
    {
        this.premise = premise;
        this.street = street;
        this.city = city ;
        this.pin = pin ;
        this.state = state ;
    }
}
class person
{
  String name,ph,email;
  address ad ;
  public person(String name,address  ad, String ph ,String email)
  {
        this.name = name;
        this.ad = ad ;
        this.ph = ph ;
        this.email = email ;
  }
}
class faculty extends person
{
    int id;
    String dept;
    String specialisation;
   public faculty(String name,address  ad, String ph ,String email,int id, String dept,String specialisation)
   {
        super(name, ad, ph, email);
        this.id = id ;
        this.dept = dept ;
        this.specialisation = specialisation ;
   }
}
class student extends person{
    int roll;
    String course;
    public student(String name,address  ad, String ph ,String email,int roll,String course)
    {
        super(name, ad, ph, email)   ;
        this.roll = roll ;
        this.course = course;
    }
}
class studentlist
{
    student[] sli = new student[100];
    public void init()
    {
        for(int i=0;i<100;i++)
        {
            sli[i] = new student("",new address(0,"i", "", 0, ""),"","",0,"");
        }
    }
}
public class  q2
{
    public static void main(String[] args)
    {
      student s;
      studentlist sl = new studentlist();
      sl.init();
      Scanner reader = new Scanner(System.in);
      String nam = reader.nextLine();
      reader.close();
      sl.sli[0].name = nam ; 
      System.out.println(nam);
    }
}