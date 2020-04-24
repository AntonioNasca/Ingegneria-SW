import java.io.*;
//Target 'L'oggetto che si aspetta il client
public interface ILabel 
{
    public String getNextLabel();
	public boolean checkUsed(int k);
	public void insertTag(String s);
}