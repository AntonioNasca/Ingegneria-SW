import java.io.*;
import java.util.Scanner;

public class Client 
{
     public static void main(String[] args) 
     { 
         //Possibili comandi ciao,bye bye,come ti chiami,che ore sono, inserire il valore sulla variabile 'comando
         
         String comando="ciao";
         Ibottarisposta ibr=new Bottaerisposta(comando);
         Server s=new Server(comando);

         String rispostaServer=ibr.risposta();

        if(rispostaServer==s.rispostaServer())
        System.out.printf("Risposta Server: %s",rispostaServer);

        else
        System.out.printf("Error %s",comando);
     }
}