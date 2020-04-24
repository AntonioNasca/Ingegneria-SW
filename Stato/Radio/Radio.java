import java.io.*;

//Context 'Interfaccia' per il Client
public class Radio 
{
   private IRadio mode=new Acceso();

   public void setMode(int x)
   {
         switch(x)
         {  
            case 1: mode=new Acceso(); break;
            case 2: mode=new Spento(); break;
         }
   }

   public void mostra()
   {
      mode.scrivi();
   }

   public void frequenza(String x)
   {
      mode.cambiaFrequenza(x);
   }
}