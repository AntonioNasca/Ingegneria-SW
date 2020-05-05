import java.util.Observer;
import java.util.Observable;

//Concrete Subject

public class Operazioni implements Observer
{
    private int operazioni=0;

    public void update(Observable o, Object s)
    {
        System.out.println("PlayStore il tuo saldo e':"+s+" Euro");
        operazioni++;


    }

    public int getOperazioni()
    {  
        return operazioni;
    }

}