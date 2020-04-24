import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Italian 
{
    private String parola=" ";
    private List<String> dizionario=Arrays.asList("Bene","Ciao","Si","Arrivederci");

    public boolean test(String x)
    {
       return dizionario.contains(x);
    }

    public void add(String x)
    { parola=parola+" "+x; }


    public void addWordItalian(int i) 
    {
        parola = parola + " " + dizionario.get(i);
    } 

    public void print()
    {
        System.out.println(parola);
        parola=" ";
    }

    public int getIndex(String x)
    {
        return dizionario.indexOf(x);
    }
}