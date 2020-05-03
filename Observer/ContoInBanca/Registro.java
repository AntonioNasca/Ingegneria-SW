import java.util.Observable;

public class Registro extends Observable
{
   private double saldo=0;
   
   public boolean ritira (double importo)
    {
        if(saldo<=importo)
        {
            System.out.println("Operazione non consentita, il tuo saldo e' di:"+saldo+" Euro");
            return false;
        }

        else
        {
        System.out.println("Operazione consentita, sta prelevando:"+saldo+" Euro");
           saldo-=importo;
           setChanged();
           notifyObservers(saldo);
           return true;
        }

    }

    public void deposita(double importo)
    {
       System.out.println("Stai depositando:"+importo+" Euro"); 
       saldo+=importo;
       setChanged();
       notifyObservers(saldo);

    }

    public double getSaldo()
    {return saldo;}
}