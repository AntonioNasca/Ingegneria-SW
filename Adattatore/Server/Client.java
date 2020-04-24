import java.io.*;
//Client
public class Client 
{
    public static void main(String[] args) 
    {
         
         ILabel s=new Label("LAB");
         String l=s.getNextLabel();

         if(l.equals("LAB1"))
         System.out.println("OK success test1 "+l);
         
         else
         System.out.println("FAILED Test 1");

        s = new Label("LAB");
        s.insertTag("cat");
        if (s.getNextLabel().equals("cat1"))
        System.out.println("OK success Test 2 "+l);

		else System.out.println("FAILED Test 2");


    }
}