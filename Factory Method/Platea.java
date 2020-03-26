import java.io.*;
import java.util.Random;

//** Concrete Product Platea */
//Platea è un ConcreteProduct
public class Platea implements Posto
{
   private final String [] nomi={"A","B","C","D","E","F"};
   private final int numero;
   private final int riga;

   public Platea ()
   {
       numero=new Random().nextInt(30);
       riga=new Random().nextInt(5);
   }

   public int getCosto()
  {
     if(numero>20) return 100;
     if(numero<20) return 80;
     return 60;

  }

  public String getPosizione()
  {
      return nomi[riga].concat(Integer.toString(numero));
  }

  public String getSettore()
  {

     return nomi[riga].concat("Platea"); 
  }

  







}
