import java.io.*;

//NOtare che sul design pattern Facade, Traslator NON E' UN'INTERFACCIA MA UNA CLASSE
public class Translator 
{
   private English e= new English();
   private Italian i= new Italian();

   public void addEnglish(String parola)
   {
      if(e.test(parola))
      e.add(parola);

      i.addWordItalian(e.getIndex(parola));
   }

   public void addItalian(String parola)
   {
      if(i.test(parola))
      i.add(parola);

      e.addWordEnglish(i.getIndex(parola));
   }

   public void printAll()
   {
      System.out.println("Italiano: ");
      i.print();
      
      System.out.println("Inglese: ");
      e.print();

   }
}