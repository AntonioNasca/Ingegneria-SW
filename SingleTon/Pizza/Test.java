import java.io.*;


public class Test
{
     
    private Pizze p=Pizze.getIstance();
       
     public void testSignl()
     {
       init();
       if(p.getPrezzo()==60)
       System.out.println("OKAY getPrezzo");
       else
       System.out.println("Error getPrezzo"+p.getPrezzo());

     }
  
     public void init()
     {
        p.Svuota();
        p.inserisci("Margherita");
        p.inserisci("Formaggi");
        p.inserisci("Capricciosa");

     }




     public void  TestLeggiFile()
     {
        p.Svuota();

        try
        {
              p.LeggiFile(null,"ordini.txt");
              System.out.println("OKAY LeggiFile");


        }

        catch (IOException e)
        {
            System.out.println("Error getPrezzo");
            System.out.println("Errore:"+e);

        }

     }


   public static void main(String[] args)
   {
       Test t1=new Test();
       t1.TestLeggiFile();
       t1.testSignl();
   }





}