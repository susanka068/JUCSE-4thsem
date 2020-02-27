import java.util.*;
import java.io.*;
class member{
    String id;
    public member(String id)
    {
        this.id = id ;
    }
}
class memberlist
{
    member[] arr =  new member[100] ; 
    void init()
    {
        for(int i=0;i<100;i++)
        {
            arr[i] = new member("");
        }
    }
}
class book
{
    String book_id ;
    public book(String book_id)
    {
        this.book_id = book_id ;
    }
}
class booklist
{
    book[] arr = new book[100];
    void init()
    {
        for(int i=0;i<100;i++)
        {
            arr[i] = new book("");
        }
    }
}
class transaction
{
        
}