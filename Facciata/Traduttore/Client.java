import java.io.*;

import javax.sql.rowset.spi.TransactionalWriter;

public class Client 
{
    public static void main(String[] args) 
    {
        Translator t=new Translator();
        t.addEnglish("Hello");
        t.printAll();

        System.out.println("-----------");
        
        t.addItalian("Arrivederci");
        t.printAll();;
        
    }

}