import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Pizze
{
    private static Pizze pz=new Pizze(); 
    private List<String> ordini=new ArrayList<>();


    public void LeggiFile(String Percorso,String Nome) throws IOException
    {
       final LineNumberReader f=new LineNumberReader(new FileReader(new File(Percorso,Nome)));

       String riga;
    
       while(true)
       {
           riga=f.readLine();
           if(null==riga) break;
           inserisci(riga);

       }


    }



    private Pizze()
    { 
        Svuota();

    }

    public static Pizze getIstance()

    {
         if(null==pz)
         return pz=new Pizze();

         else
         return pz;

    }

    public void inserisci(String x)
    {
       if(!ordini.contains(x))
       ordini.add(x);
    }


    public int getPrezzo()
    {
        int  prezzopz=0;

         if(ordini.contains("Margherita"))   prezzopz+=10;
         if(ordini.contains("Capricciosa"))  prezzopz+=20;
         if(ordini.contains("Formaggi"))  prezzopz+=30;



         return prezzopz;

    }



    public void Svuota()
    {
        ordini.clear();

    }

    




}