import java.util.Observer;
import java.util.Observable;

public class Atm implements Observer
{
    private int operazioni=0;

    public void update(Observable obs, Object s )
    {
       System.out.println("Monitor ATM: il tuo saldo e' di:"+s+" Euro");
       operazioni++;

    }

    public int getOperazioni()
    { return operazioni;}


}
