import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.List;
import java.util.ArrayList;

public class PagamentiMultiton
{
   
   private static int max=2; //Massime istanze possibili
   private static final PagamentiMultiton[] istanze=new PagamentiMultiton[max];
   private List<Float> importi = new ArrayList<>();

   private PagamentiMultiton() 
   {
      svuota();
   }

   public static PagamentiMultiton getIstance(int i) 
   {
      if(i>=max) 
      { 
         System.out.println("Hai superato il numero di istanze"); 
         return null;
      }

      else if(null==istanze[i]) 
      {
         istanze[i]=new PagamentiMultiton();
         return istanze[i];
      }

      return null;
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
