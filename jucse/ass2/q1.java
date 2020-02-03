import java.util.*;
import java.io.*;
class customer
{
    public String name , ph ;
    public int id , current_loan ;
    static int credit ;
    public int remain = credit ;
    public int loan_amount ; 
    public customer(String name,int id,String ph,int current_loan)
    {
        this.name = name ;
        this.id = id ;
        this.ph = ph ;
        this.current_loan = current_loan ;
    }
    public void loandone()
    {
        System.out.println("enter loan amount");
        Scanner reader = new Scanner(System.in);
        loan_amount = reader.nextInt();
        if(loan_amount>credit)
        {
            System.out.println("Insufficient Credit :(");

        }
        else{
            System.out.println("Succes :)");
        remain = remain - current_loan ; 
        current_loan += loan_amount ; 
        }
    }
    public int getcredit()
    {
        return credit ; 
    }
}
class normal extends customer{
    public normal(String name,int id,String ph,int current_loan)
    {
        super(name, id, ph, current_loan);
    }
    public void setcredit()
    {
       System.out.println("enter the credit ammount");
       Scanner reader = new Scanner(System.in);
       credit = reader.nextInt();   
    }
}
class privilaged extends customer
{
    public privilaged(String name,int id,String ph,int current_loan)
    {
        super(name, id, ph, current_loan);
    }
    public void setcredit()
    {
       System.out.println("enter the credit ammount");
       Scanner reader = new Scanner(System.in);
       credit = reader.nextInt();   
    }
}
public class q1
{
    public static void main(String[] args)
    {
        normal nc = new normal("pratik",71, "7846" , 5);
        privilaged pc = new privilaged("souvick", 12, "73438", 10);
        nc.setcredit();
        nc.loandone();
    }
}