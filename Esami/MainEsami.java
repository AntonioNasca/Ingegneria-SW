import java.io.*;

public class  MainEsami
{
   public static void main(String[] args)    
   {
       System.out.println("inizio ad eseguire il programma"); 
       System.out.println("Creo il primo studente");
       
       Studente s=new Studente();

       s.setNome("Antonio", "Nasca");
       s.setMatr("X81000795");
       s.nuovoEsame("Programmazione II","X81000795",26);
       s.nuovoEsame("Architettura","X81000795",28);
       s.printAll();


   }



}
