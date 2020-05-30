import java.io.*;


//Leaf
public class ProdottoOnline extends Iprodotto
{
    String nome;
    Float peso,prezzo;

    public ProdottoOnline(String n,Float p,Float pr)
    {
        nome=n;
        peso=p;
        prezzo=pr;
    }

    public String getNome()
    {return nome;}

    public Float getPeso()
    {return peso;}

    public Float getPrezzo()
    {return prezzo;}

    public void show()
    {
       System.out.println("Prodotto Online, Nome: "+getNome()+", Peso:"+getPeso()+" grammi"+", Prezzo:"+getPrezzo()+" Euro");
    }
}