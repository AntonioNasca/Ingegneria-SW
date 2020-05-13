import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.management.openmbean.ArrayType;

public class Esercitazione
{
     private static List<Integer> numeri=List.of(8,5,6,-7,14,25,1,-5);

     //Predicate
     static Predicate <Integer> positive=x->x>=0;
     static Predicate <Integer> negative=x->x<0;
    
    
    public static void main(String[] args) 
    {
      System.out.println("La lista dove stiamo lavorando e' questa "+ numeri);
      System.out.println("Ci sono "+getPositivi()+" numeri positivi");
      System.out.println("Ci sono "+getNegativi()+" numeri negativi");
      System.out.println("-----------------------------------------");


      getMaxMin();
      
      

    }


   public static Long getPositivi()
   {
      return numeri.stream().filter(positive).count();
   }

   public static Long getNegativi()
   {
      return numeri.stream().filter(negative).count();
   }
   
   public static void getMaxMin()
   {
       Integer max,min,maxP,minP,maxN,minN;

       max=numeri.stream().mapToInt(x->x).max().orElseThrow();
       min=numeri.stream().mapToInt(x->x).min().orElseThrow();

       
       maxP=numeri.stream().filter(positive).mapToInt(x->x).max().orElseThrow();
       minP=numeri.stream().filter(positive).mapToInt(x->x).min().orElseThrow();

       maxN=numeri.stream().filter(negative).mapToInt(x->x).max().orElseThrow();
       minN=numeri.stream().filter(negative).mapToInt(x->x).min().orElseThrow();

       System.out.println("Ecco i rispettivi massimi e minimi della lista, massimo "+max+" e minimo "+ min);
       System.out.println("-----------------------------------------");

       System.out.println("Il numero massimo dei numeri positivi e' "+maxP);
       System.out.println("Il numero min dei numeri positivi e' "+minP);
       System.out.println("-----------------------------------------");

       System.out.println("Il numero massimo dei numeri negativi e' "+maxN);
       System.out.println("Il numero min dei numeri negativi e' "+minN);
       System.out.println("-----------------------------------------");

   }


   
    
}
