import java.io.*;

public class Sospeso implements Istudente
{
     private static int media=0;

     public Sospeso(int m)
     {
        media=m;

     }
     public Float getMedia()
     {
          return (float)media;
     }

     public void nuovoVoto(Float x)
     {

     }

     public void nuovoEsame(String matricola,Float voto)
     {
         System.out.println("Mi dispiace questo studente ha la carriera sospesa");
     }
   
}