import java.io.*;

public class Libro implements Interfaceplay
{
    private String nome;
    private float prezzo;
    private float peso;

    public Libro(String n,float p,float ps)
    {
       nome=n;
       prezzo=p;
       peso=ps;
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
        return peso;
    }

    public void show()
    {
      System.out.println("Libro: "+getNome()+", Prezzo: "+getPrezzo()+" Euro, Peso:"+getPeso()+" grammi");
    }

    //Non fanno niente
    public void add(Interfaceplay i)
    {}

    public void remove(Interfaceplay i)
    {}   
}