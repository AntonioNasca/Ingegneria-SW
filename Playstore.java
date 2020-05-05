import java.util.Observable;

//Observer
public class Playstore extends Observable
{    
    private double saldo;
   

    public void CompraApp(int x)
    {
        
        if(verifica(x)) System.out.println("Acquisto andato a buon fine");

        else System.out.println("Acquisto non andato a buon fine, ricarica il tuo saldo");
    }


    public boolean verifica(int x)
    {
        if(x==1 && saldo>=20)
        {
            System.out.println("Stai comprando LEGO STAR WARS");
            saldo-=20;
            setChanged();
            notifyObservers(saldo);
            return true;
        } 


        if(x==2 && saldo>=10 )
        {
             System.out.println("Stai comprando Call of duty");
             saldo-=10;
             setChanged();
             notifyObservers(saldo);
             return true;
        } 


        if(x==3 && saldo>=40)
        {
             System.out.println("Stai comprando Candy Crush");
             saldo-=40;
             setChanged();
             notifyObservers(saldo);
             return true;
        }
        
        return false;
    }

    
    public void Ricarica(int importo)
    {
         saldo=+importo;
         setChanged();
        notifyObservers(saldo);
    }

    public double getSaldo()
    {
        setChanged();
        notifyObservers(saldo);
        return saldo;
        
    }
}