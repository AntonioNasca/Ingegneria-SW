import java.io.*;

public class Main 
{
  public static void main(String[] args) 
  {
     //Carrello
     Iprodotto car=Creator.getCarrello();

    //Prodotti
     Iprodotto pronl1=Creator.getProdottoOnline("Prosciutto cotto",100f,10f);
     Iprodotto pronl2=Creator.getProdottoOnline("Mozzarella",50f,15f);
     Iprodotto pronl3=Creator.getProdottoOnline("Formaggio",20f,17f);
     

     //Operazioni add,show,remove oggetti child
     System.out.println(" ");
     System.out.println("Iniziamo ad aggiungere i prodotti online");
     System.out.println(" ");

     System.out.println("Sto Aggiungendo questi prodotti al carrello");
     System.out.println("---------------------------");
     pronl1.show();
     pronl2.show();
     pronl3.show();
     
     System.out.println(" ");
     System.out.println(" ");
     car.add(pronl1);
     car.add(pronl2);
     car.add(pronl3);


     System.out.println("Carrello Online");
     System.out.println("---------------------------");
     car.show();
     System.out.println("---------------------------");

     System.out.println(" ");
     System.out.println("Iniziamo a rimuovere i prodotti online, rimuovo il primo e il secondo prodotto Online");

     
     System.out.println(" ");
     car.remove(pronl1);
     car.remove(pronl2);

     System.out.println("Carrello Online");
     System.out.println("---------------------------");
     car.show();
     System.out.println("---------------------------");
     
     

  }   
}