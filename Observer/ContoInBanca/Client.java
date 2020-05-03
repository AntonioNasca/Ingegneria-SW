import java.io.*;

public class Client
{
    private Registro r=new Registro();
    private Atm a=new Atm();
    
    public static void main(String[] args) 
    {
        Client c=new Client();
        c.test();
    }

    public void test()
    {
      //Prima operazione
      r.addObserver(a);
      r.ritira(100);
      r.deposita(300);
      
      System.out.println("---------------------------");
      System.out.println("Saldo attuale: " + r.getSaldo() + " euro");
      System.out.println("Il subject ha effettuato " +a.getOperazioni() + " operazioni");
      System.out.println("---------------------------");
      
      
      r.ritira(200);
      r.deposita(50);
      System.out.println("Il subject ha effettuato " +a.getOperazioni() + " operazioni");
      System.out.println("---------------------------");

      

    }
}
