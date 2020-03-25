import java.io.*;
 
public class Esame extends Studente
{
   
    private String matricola;
    private float voto;
    private String nomeEsame;
   
   public Esame(String n,String matri,int v)
   {
      nomeEsame=n;
      matricola=matri;
      voto=v;

   }

   public String getMat()
   {
      return matricola;

   }


   public float getVoto()
   {
      return voto;
   }

   public String getNomeEsame()
   {
      return nomeEsame;

   }


}
