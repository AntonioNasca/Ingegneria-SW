import java.io.IOException;

public class MainSingleTon
{
    public static void main(String[] args) 
   {
        //Istanza 1
        PagamentiSingleTon p1=PagamentiSingleTon.getIstance();
        
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


           
        //Istanza 2
        PagamentiSingleTon p2=PagamentiSingleTon.getIstance();

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
