import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Studente implements Istudente 
{
      private List<Float> voti=new ArrayList<>();
      private List<Esame> Esami=new ArrayList<>();

      public Studente()
      {
         Svuota();

      }


      public void nuovoVoto(Float x)
      {
        voti.add(x);
      }

      public Float getMedia()
      {
        float med=0;
        for(Float v: voti)
        med+=v;
        
        med=med/(float)voti.size();
        return med;
      }

      public void nuovoEsame(String matricola,Float voto)
      {
           if(Esami.isEmpty())
           {
             System.out.println("Esame creato per la matricola:"+matricola+" ho aggiunto il voto:"+voto);
             Esame e=new Esame(matricola,voto);
             Esami.add(e);
           }
      }


      public void Svuota()
      {
          voti.clear();
      }


}