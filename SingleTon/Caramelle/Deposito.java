import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Deposito
{
    private static Deposito dp=new Deposito();
    private List<String> list=new ArrayList<>();

    public void LeggiFile(String Percorso,String NomeFile) throws IOException
    {
       final LineNumberReader f=new LineNumberReader( new FileReader( new File(Percorso,NomeFile)));

       String riga;
       while(true)
       {
           riga=f.readLine();
           if(null==riga) break;

           Inserisci(riga);
       }

    }

   private Deposito()
   {
       Svuota();
   }

   public void Inserisci(String x)
   {
       if(!list.contains(x))
       list.add(x);
   }

   public static  Deposito getIstance()
   { 
        if(null==dp)
        return dp=new Deposito();

        else
        return dp;
   }


   public int GetPrezzo()
   {
       int prezzo=0;
       
       if(list.contains("Cioccolata")) prezzo+=30;
       if(list.contains("Marmellata")) prezzo+=20;
       if(list.contains("Nutella")) prezzo+=50;

       return prezzo;

   }

   public void Svuota()
   {
      list.clear();
      
   }
 


}