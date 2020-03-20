import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.List;
import java.util.ArrayList;

public class PagamentiSingleTon
{
   
   private static PagamentiSingleTon pg=new PagamentiSingleTon();
   private  List<Float> importi=new ArrayList<>();


   private PagamentiSingleToni()
    {
       svuota();
    }

   public static PagamentiSingleTon getIstance()
   {  
        if(null==pg) pg=new PagamentiSingleTon();
        return pg;
        
   }
   
   public void LeggiFile(String c,String n) throws IOException
   {
      final LineNumberReader f=new LineNumberReader(new FileReader(new File(c,n)));

      String riga;
      while(true)
      {
         riga=f.readLine();
         if(null==riga) break;
         inserisci(Float.parseFloat(riga));

      }

      f.close();

   }

   public void inserisci(float x)
   {
      if(!importi.contains(x))
      importi.add(x);

   }

   public Float calcolaSomma()
   {
      float somma=0;
      for(float v:importi)
      somma+=v;
      
      return somma;
    }

    public float calcolaMax()
    {
       float max=0;
       for(float v:importi)
       {
           if(max<v) max=v;
       }
       return max;

    }


    public void svuota()
    {
       importi=new ArrayList<>();

    }

    


}
