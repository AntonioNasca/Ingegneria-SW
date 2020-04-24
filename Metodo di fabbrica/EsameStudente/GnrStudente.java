import java.io.*;

public abstract class GnrStudente
{
   private static int v=0;

   public static Istudente getStudente()
   {
     
      if(v==0) return new Studente();

      else return new Sospeso(v);

      
   }

}