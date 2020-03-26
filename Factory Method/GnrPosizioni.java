import java.io.*;
import java.util.TreeSet;
//** GnrPosizioni è un Creator */
public abstract class GnrPosizioni
{
   private static final int MAXPosti=100;
   private TreeSet<String> pst=new TreeSet<>(); //Lista ordinata di posti
 
   public Posto PrendiNumero(int x)
   {
     if(pst.size()==MAXPosti) return null;
      
      Posto p;

      do
      {
        p=getPosto(x);

      }
      while(pst.contains(p.getPosizione())); //Din quadndo ci sono posti,fa il ciclo
      pst.add(p.getPosizione());
      return p;
   }


   public void printPostiOccupati()
   {
      
      for(String s:pst)
      System.out.println(s+" ");


   }

   public abstract Posto getPosto(int tipo);

}
