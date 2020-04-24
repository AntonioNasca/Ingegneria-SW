import java.io.*;
public class Main 
{
   public static void main(String[] args) 
   {
       System.out.println("Parto con il programma");

       Istudente s=GnrStudente.getStudente(); 
       Istudente s1=GnrStudente.getStudente(); 
       Istudente s2=GnrStudente.getStudente(); 
       s.nuovoEsame("X8100795", 28f);
       s1.nuovoEsame("X8100794", 25f);
       s2.nuovoEsame("X8100792", 27f);
       
      
       
   }
}