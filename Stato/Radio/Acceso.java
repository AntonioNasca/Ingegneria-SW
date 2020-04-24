import java.io.*;
import java.util.Random;

//ConcreteState
public class Acceso implements IRadio
{
    private int n,i=0;
    private int time;
    private String Frequenza="115.0";

    public void scrivi()
    {
       if(i==0)
       System.out.println("Radio Accesa");
       time=new Random().nextInt(5) + 1;
       System.out.printf("Frequenza Radio: %s\n",Frequenza);

      if(Frequenza=="115.0")
      {
        System.out.println("Benvenuto su radio Cipolla è Mark che vi parla:");
       for(int i=0;i<time;i++)
       {
            n=new Random().nextInt(5) + 1;
            aspetta();
            if(n==1) System.out.println("Mark:Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam venenatis, velit in pharetra finibus, magna tortor malesuada odio, eget tincidunt sem lorem nec lacus.");
            if(n==2) System.out.println("Mark:onec pretium posuere ex sed ultricies. Vivamus et magna gravida, rhoncus tortor eu, pharetra ante. Vestibulum ac fermentum dui.");
            if(n==3) System.out.println("Mark:Fusce semper iaculis justo, ut semper nulla blandit sed. Donec at sagittis dolor. Suspendisse blandit iaculis ligula, sit amet sagittis nulla faucibus id");
            if(n==4) System.out.println("Mark:Donec eget suscipit turpis. Curabitur accumsan varius ex ut mattis. Nulla facilisi. Maecenas mattis, augue a rutrum pellentesque, arcu enim finibus nisl, nec finibus ante nunc sit amet nisl. Fusce dapibus turpis massa, vel commodo urna");
            if(n==5) System.out.println("Mark:ibendum ut. Cras tristique magna et dui sodales, ac sollicitudin erat dapibus.");
       }

      }

      if(Frequenza=="120.0")
      {
        System.out.println("Benvenuto su radio Salame è Luice che vi parla:");
       for(int i=0;i<time;i++)
       {
            n=new Random().nextInt(3) + 1;
            aspetta();
            if(n==1) System.out.println("Luice:La mia anima è pervasa da una mirabile serenità, simile a queste belle mattinate di maggio che io godo con tutto il cuore. ");
            if(n==2) System.out.println("Luice:Sono solo e mi rallegro di vivere in questo luogo che sembra esser creato per anime simili alla mia. Sono così felice, mio caro, così immerso nel gatto");
            if(n==3) System.out.println("Luice:Non potrei disegnare nulla ora, neppure un segno potrei tracciare; eppure mai sono stato così gran pittore come in questo momento.");    
       }

      }

    }

    public void aspetta()
    {
         try { Thread.sleep(2000);}

         catch (InterruptedException e) { } 
    }

    public void cambiaFrequenza(String x)
    {
         Frequenza=" ";
         System.out.println("Cambio la frequenza della radio:");
         aspetta();
         Frequenza=x;
         i++;
         scrivi();
    }
    
}