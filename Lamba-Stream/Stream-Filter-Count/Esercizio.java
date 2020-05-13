import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Esercizio 
{
     private  static List<String> nomi=List.of("Leonardo","Raffaello","Michelangelo","Donatello","Raffaello"
     ,"Raffaello","Raffaello","Michelangelo","Michelangelo");     

     private static String x="Raffaello";
     
    public static void main(String[] args) 
    {
        
        System.out.println("Ho trovato, "+ cercanomi(x) + " volte il nome "+x);
        
    }


    public static  long cercanomi(String x)
    {    
      return nomi.stream().filter(s->s.equals(x)).count();
    }
}