import java.io.*;

public class Client
{
  //Carrello
  private static final Interfaceplay car=Creator.getCarrello();

  //Collezzione size
  private static final Interfaceplay clG=Creator.getSizeG();
  private static final Interfaceplay clL=Creator.getSizeL();
  

  //Giochi
  private static final Interfaceplay g1=Creator.getGioco();
  private static final Interfaceplay g2=Creator.getGioco();

  //Libri
  private static final Interfaceplay l1=Creator.getLibro();
  private static final Interfaceplay l2=Creator.getLibro();
  //private static Interfaceplay l=Creator.getLibro();
   public static void main(final String[] args) 
   {
       System.out.println("Iniziamo");

       System.out.println("Visualizzo i prodotti che hai scelto di prendere");

       System.out.println(" ");
       System.out.println("Giochi:");
       System.out.println("--------------");
       g1.show();
       g2.show();
       System.out.println("--------------");

       System.out.println(" ");
       System.out.println("Libri:");
       System.out.println("--------------");
       l1.show();
       l2.show();
       System.out.println("--------------");


       System.out.println("Aggiungo al carrello i prodotti richiesti");
       car.add(g1);
       car.add(g2);
       car.add(l1);
       car.add(l2);

       
       
       car.show();
       
       



   }    
}