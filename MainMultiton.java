import java.io.IOException;

public class MainMultiton
{
    public static void main(String[] args) 
   {
        //Prima istanza
        Pagamenti p1=Pagamenti.getIstance(0);
        
        try
        {
           p1.LeggiFile("txtFile","Pagamenti1.txt");
          

           System.out.println("Inizio esecuzione P1");
           System.out.println("Somma="+p1.calcolaSomma());

        }

        catch(IOException e)
        {
           System.out.println("File Pagamenti1.txt non trovato");
        }



        //Seconda istanza   
        Pagamenti p2=Pagamenti.getIstance(1);

        try
        {
           p2.LeggiFile("txtFile","Pagamenti2.txt");
         

           System.out.println("Inizio esecuzione P2");
           System.out.println("Somma="+p2.calcolaSomma());
          
          
        }

        catch(IOException e)
        {
           System.out.println("File Pagamenti2.txt non trovato");
        }

       
        
   }


}
