import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Carrello extends Iprodotto
{
    private String nome;
    private LinkedList<Iprodotto> lista=new LinkedList<Iprodotto>();

    public Carrello(String n)
    {
      nome=n;
    }

    public String getNome()
    {return nome;}

    @Override
    public void show()
    {
       for(int i=0;i<lista.size();i++)
       lista.get(i).show();
    }
   
    @Override
    public void add(Iprodotto p)
    {
        lista.add(p);
    }

    public void remove(Iprodotto p)
    {
      if(lista.size()!=0)
      lista.remove(p);

      else
      System.out.println("Il prodotto e' gia' stato rimosso");

    }
}