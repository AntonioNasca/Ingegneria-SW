import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Studente extends Persona
 {
     private String Matricola;
     private List<Esame> esami=new ArrayList<>();

    public void setMatr(String m)
    {
      Matricola=m;

    }

    public void nuovoEsame(String n,String matr,int v)
    {
       Esame e=new Esame(n,matr,v);
       esami.add(e);
         
    }

    public float getMedia()
    {
       float Med=0;
       if(esami.size()==0) return 0;
       for(Esame e: esami)
       Med+=e.getVoto();

       return Med/esami.size();

    }

    public void  printAll()
    {
       super.printAll();
       System.out.println( "Matricola="+Matricola);
       for(Esame e: esami)
       System.out.println(e.getNomeEsame()+" "+e.getMat()+ " :"+e.getVoto());
       System.out.println("Media="+getMedia());


    }



}
