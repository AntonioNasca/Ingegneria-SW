import java.io.*;

//Adpter
public class Bottaerisposta extends Server implements Ibottarisposta 
{

   public Bottaerisposta(String richiesta)
   {
       super(richiesta);

   }

   public String risposta()
   {return rispostaServer();}
}