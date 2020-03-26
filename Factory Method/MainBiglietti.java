import java.io.*;
/**MainBiglietti */
public class MainBiglietti
{
   private static Posizioni cp=new Posizioni();
   
   public static void main(String[] args)
   {
       Posto pos=cp.PrendiNumero(0);
       Biglietto b=new Biglietto(pos);
       
       System.out.println("Prima Cliente");
       b.Intesta("Mario");
       System.out.println("Info Biglietto");
       System.out.println("Costo Biglietto:"+b.getCosto());
       System.out.println("Intestatario:"+b.PrintAll());
       System.out.println("Settore:"+pos.getSettore());

       System.out.println("----------------------- ");
       //Secondo biglietto
       Posto pos1=cp.PrendiNumero(1);
       Biglietto b1=new Biglietto(pos1);
   
       System.out.println("Secondo Cliente");
       b1.Intesta("Giovanni");
       System.out.println("Info Biglietto");
       System.out.println("Costo Biglietto:"+b1.getCosto());
       System.out.println("Intestatario:"+b1.PrintAll());
       System.out.println("Settore:"+pos1.getSettore());
      
       System.out.println(" ");
       System.out.println("----------------------- ");
       System.out.println("Posti occupati dai clienti:");
       cp.printPostiOccupati();

       

   }

}
