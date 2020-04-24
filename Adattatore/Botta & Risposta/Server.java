import java.io.*;


//Adptee
public class Server 
{
    private String risposta;

    public Server(String richiesta)
    {
         risposta=richiesta;
    }

    public String rispostaServer()
    {
      if(risposta=="ciao") return "Come va?";  
      if(risposta=="bye bye") return "Arrivederci";  
      if(risposta=="come ti chiami") return "Come ti chiami tu?";  
      if(risposta=="che ore sono") return "E chi lo sa?"; 
      

      return "Hai sbagliato a digitiare? digita: ciao, bye bye, come ti chiami, che ore sono, perchè hai scritto "+risposta+"?";
    
    }
}