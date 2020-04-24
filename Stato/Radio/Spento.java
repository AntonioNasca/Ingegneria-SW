import java.io.*;

//ConcreteState
public class Spento implements IRadio
{
    public void scrivi()
    {
        System.out.println("Sto spegnedo la radio..");
        aspetta();
    }

    public void cambiaFrequenza(String x)
    {
        System.out.println("Radio Spenta");
    }

    public void aspetta()
    {
         try { Thread.sleep(2000);}

         catch (InterruptedException e) { } 
    }

}