import java.io.*;

public class Gioco implements Interfaceplay
{
    private String nome;
    private float prezzo;

    public Gioco(String n,float p)
    {
       nome=n;
       prezzo=p;
    }

    public String getNome()
    {
      return nome;
    }

    public float getPrezzo()
    {
        return prezzo;
    }

    public float getPeso()
    {
        return 0;
    }

    public void show()
    {
      System.out.println("Gioco: "+getNome()+", Prezzo: "+getPrezzo()+" Euro");
    }

    //Non fanno niente
    public void add(Interfaceplay i)
    {}

    public void remove(Interfaceplay i)
    {}   
    
}