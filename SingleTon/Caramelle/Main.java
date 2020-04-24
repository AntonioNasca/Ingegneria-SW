import java.io.*;

public class Main 
{
     public static void main(String[] args)
    {
        System.out.println("Sto partendo");
        
        Deposito d=Deposito.getIstance();

        try
        {
           d.LeggiFile(null,"Ordini.txt");
           System.out.println("Il prezzo totale e':"+d.GetPrezzo());

        }

        catch (IOException e)
        {
            System.out.println("Non ho trovato il file Ordini.txt:");
            System.out.println("L'errore e' il seguente:"+e);


        }
        
        
    }
 

}