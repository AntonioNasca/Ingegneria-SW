import java.io.*;
import java.util.*;
public class Main 
{
    Playstore p=new Playstore();
    Operazioni o=new Operazioni();
    int scelta=0;

    public static void main(String[] args) 
    {
        Main c=new Main();

        System.out.println("Benvenuto sul tuo PlayStore, vuo acquistare qualcosa? SI o NO");
        Scanner input = new Scanner(System.in);
        String comando = input.nextLine();

        if(comando.equals("si") || comando.equals("SI"))
        c.test();

        if(comando.equals("no") || comando.equals("NO"))
        System.out.println("Allora ciao!");

        
    }

    public void test()
    {
        p.addObserver(o);

        while(scelta!=4){
        Scanner input = new Scanner(System.in); 

        System.out.println(".........................");
        System.out.println("Vuoi compare un gioco? digita 1");
        System.out.println("Vuoi ricaricare il tuo saldo? digita 2");
        System.out.println("Vuoi vededere il tuo saldo digita 3");
        System.out.println("Hai finito? digita 4");
        String comando2 = input.nextLine();
        
        scelta=Integer.parseInt(comando2);

        if(scelta==1)
        {
            Scanner input2 = new Scanner(System.in);

            System.out.println("Vuoi compare LEGO STAR WARS? digita 1");
            System.out.println("Vuoi compare Call of duty? digita 2");
            System.out.println("Vuoi compare Candy Crush? digita 3");

            String giocos = input2.nextLine();
            int gioco=Integer.parseInt(giocos);

            if(gioco==1) p.CompraApp(1);

            if(gioco==2) p.CompraApp(2);

            if(gioco==3) p.CompraApp(3);



        }
        
        if(scelta==2)
        {
            System.out.println("Di quanto vuoi ricaricare?");
            String ricarica = input.nextLine();
            int importo=Integer.parseInt(ricarica);
            p.Ricarica(importo);
        }

        if(scelta==3)
        p.getSaldo();

        if(scelta==4) return;
    }
        
    }
}
