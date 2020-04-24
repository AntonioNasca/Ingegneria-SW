import java.io.*;
//**Concrect Product */
import java.util.Random;

//Palco è un concrect product
public class Palco implements Posto
{
    private final int Nposto;
   
    public Palco()
   {
     Nposto=new Random().nextInt(21);

   }

  public String getPosizione()
  {
     return (Integer.toString(Nposto));
  }


 public  int getCosto()
  {
       if(Nposto>10) return 50;
       return 40;

  }

  public String getSettore()
  {
     if(Nposto==20) 
     return "Palco zona rossa";

     if(Nposto>10)
     return "Palco zona verde";
     
     return "Palco zona gialla";

  }



}
