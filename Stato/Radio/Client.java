import java.io.*;

//Client
public class Client 
{
    public static void main(String[] args)
    {
        //Mode 1 Acceso DEFAULT
        //Mode 2 Spento
        //Frequenze 115.0 DEFAULT 120.0

        Radio r=new Radio();

        r.mostra();
        r.frequenza("120.0");
        r.frequenza("115.0");
        r.setMode(2);
        r.mostra();

        r.setMode(1);
        r.mostra();
        r.setMode(2);
        r.mostra();
        
        
        
            
    }
}