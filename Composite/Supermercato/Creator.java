//Creatore simile alò Factory method
public class Creator 
{
    public static Iprodotto getCarrello()
    {
        return new Carrello("Carrello");
    }

    public static Iprodotto getProdottoOnline(String nome,Float peso,Float prezzo)
    {
        return new ProdottoOnline(nome,peso,prezzo);
        
    }
}