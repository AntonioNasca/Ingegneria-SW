import java.io.*;
import java.io.IOException;

public class Main 
{
     public static void main(String[] args) 
    {
       System.out.println("Parte il programma");   

       Pizze p=Pizze.getIstance();

      

       try
       {
           p.LeggiFile(null,"ordini.txt");
           System.out.println("Okay, inizio a far partire le procedure");
           System.out.println("La somma delle pizze e':"+p.getPrezzo());
   

       }

       catch(IOException e)
       {
        System.out.println("Non ho trovato il file ordini.txt");
        System.out.println(e);
 
       }
    }


}