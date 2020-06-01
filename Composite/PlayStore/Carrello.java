import java.io.*;
import java.util.*;

public class Carrello implements Interfaceplay
{
   private String nome;
   private List<Interfaceplay> lista=new ArrayList<>();
   
   public Carrello()
   {
     
   }

   public String getNomeCarrello()
   {
       return nome;
   }

   //Metodi di Gioco e Libro
   public float getPrezzo()
   {
      return lista.stream().map(x->x.getPrezzo()).reduce(0f,Float::sum);
   }

   public float getPeso()
   {
      return lista.stream().map(x->x.getPeso()).reduce(0f,Float::sum);
   }

   public String getNome()
   {
      return nome;
   }

   public void add(Interfaceplay i)
   {
      lista.add(i);
   }


   public void remove(Interfaceplay i)
   {
      if(lista.size()!=0)
      {
         System.out.println("Rimuovo il gioco");
         lista.remove(i);
      }
      

      else System.out.println("Stai rimuovendo un gioco gia' rimosso dal carrello");
   }
   
   public void show()
   {
      System.out.println("");
    System.out.println("Carrello");
    System.out.println("----------------------");
    for(Interfaceplay res:lista)
    res.show();
    System.out.println("---------------------- Prezzo Totale:"+getPrezzo()+"Euro, Peso totale: "+getPeso()+" grammi"); 
   }

}
