import java.io.*;

public class Test 
{
   Deposito d=Deposito.getIstance();


   public void init()
   {
      d.Svuota();;
      d.Inserisci("Nutella");
      d.Inserisci("Marmellata");
      d.Inserisci("Cioccolata");
   }


   public void TestLeggiFile()
   {
      
      try
      {
           d.LeggiFile(null, "Ordini.txt");
           System.out.println("Okay, LeggiFile funziona");
      }

      catch (IOException e)
      {
        System.out.println("Error, LeggiFile non funziona");
      }

   }

   public void TestGetPrezzo()
   {
      init();
      
      if(d.GetPrezzo()==100)
      {
        System.out.println("Okay, GetPrezzo funziona");
      }

      else
      {
        System.out.println("Error, GetPrezzo non funziona");

      }

   }


  public static void main(String[] args) 
  {
     Test t=new Test();
     t.TestLeggiFile();;
     t.TestGetPrezzo();
     System.out.println("Test finito.");    
  }

}