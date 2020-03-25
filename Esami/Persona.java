import java.io.*;

public class Persona
{
   private String Nome, Cognome;

   public void setNome(String n, String c)
   {
      Nome=n; Cognome=c;
   }

   public void  printAll()
   {
      System.out.println("Nome:"+Nome+" Cognome:"+Cognome);

   }


}
