import java.io.*;
import java.util.*;

public class Creator 
{
   private static final String[] NomeGioco={"God of War III","Sparta","Control","Iron man"};
   private static final float[] PrezziG={30f,20f,50f,23f};
  
   private static final String[] NomeLibri={"Divina commedia","Spartacus","Controllors","Due metri sopra il cielo"};
   private static final float[] PrezziL={30f,60f,67f,12f};
   private static final float[] PesoL={100f,150f,134f,275f};

   private static int i=-1;
   private static int j=-1;

   public static Interfaceplay getCarrello()
   {
      return new Carrello();
   } 
   
   public static Interfaceplay getGioco()
   {
      AggiornaIndiceG();
      return new Gioco(NomeGioco[j],PrezziG[j]);
   } 

   public static Interfaceplay getLibro()
   {
      AggiornaIndiceL();
      return new Libro(NomeLibri[i],PrezziL[i],PesoL[i]);
   } 

   //Aggiorno gli indici di libro e gioco

   private static void AggiornaIndiceL()
   {
      if(i<NomeLibri.length-1)
      i++;

      else
      i=0;
   }

   private static void AggiornaIndiceG()
   {
      if(i<NomeGioco.length-1)
      j++;

      else
      j=0;
   }



   
}