import java.io.*;
import java.util.Arrays;
import java.util.List;
//Adpter

public class Label implements ILabel 
{
	private List< String > l = Arrays.asList("cat", "dog", "sheep");
	private LabelServer ls;
	private String p;

	public Label(String prefix) {
		p = prefix;
		ls = new LabelServer(p);
	}

	
	public String getNextLabel() {
		return ls.serveNextLabel();
	}

	
	public boolean checkUsed(int k) {
		return (ls.getCount() >= k);
	}

	public void insertTag(String t) {
		if (l.contains(t)) ls.change(t);
	}
}