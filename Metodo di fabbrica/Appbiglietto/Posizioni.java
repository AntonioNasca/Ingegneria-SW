public class Posizioni extends GnrPosizioni
{
   public Posto getPosto(int tipo)
   {
     //Creo l'istanza di ConcreteProduct
     if(tipo==1) return new Palco();
     return new Platea();

   }


}
