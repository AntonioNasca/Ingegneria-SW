import java.io.*;
//Biglietto è un client
public class Biglietto
{
     String nome;
     private final Posto pos;

     public Biglietto(Posto p)
     {
       pos=p;

     }

     public void Intesta(String s)
     {
       nome=s;
        
     }

     public String PrintAll()
     {
        return nome.concat(" ").concat("Posizione:").concat(pos.getPosizione());

     }

     public String getNome()
     {
         return nome; 
     }

     public int getCosto()
     {
       return pos.getCosto();

     }



}
