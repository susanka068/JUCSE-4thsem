package surprise;
import java.util.*;
import java.io.*;
class instance
{   
    
    float attr1,attr2,attr3,attr4,attr5;
   // String filename = "instance.txt";
   // FileReader fw = new FileReader(filename);
    public instance(float attr1,float attr2,float attr3,float attr4,float attr 5)
   {
        this.attr1 = attr1;
        this.attr2 = attr2 ;
        this.attr3 = attr3 ;
        this.attr4 = attr4 ;
        this.attr5 = attr5 ;

   }

}
class instancellist
{
    float attr1,attr2,attr3,attr4,attr5;
    instance arr[] = new instance[100];
    for(int i=0;i<100;++i)
    {
        Scanner r = new Scanner(System.in);
        float attr1 = r.nextFloat();
        Scanner r = new Scanner(System.in);
        float attr2 = r.nextFloat();
        Scanner r = new Scanner(System.in);
        float attr3 = r.nextFloat();
        Scanner r = new Scanner(System.in);
        float attr4 = r.nextFloat();
        Scanner r = new Scanner(System.in);
        float attr5 = r.nextFloat();
        arr[i] = new instance(attr1, attr2, attr3, attr4, attr5);
    }
    public void calculateavg()
    {

    }

}

public class sur1
{
    public static void main(String[] args)
    {
             
    }
}
