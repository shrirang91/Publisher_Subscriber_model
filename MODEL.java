//Shrirang Adgaonkar
package sad.adgaonkar.shrirang;
import java.io.*;

public class MODEL 
{
	public static void main(String args[]) throws Exception
	{
		//@begin
		String request = args[0];
		new MODEL().run(request); 
		//@end
	}
	
	private HANDLER handle;
	//@begin
	public void run(String request) throws Exception
	{
		//@begin
		BufferedReader br = new BufferedReader(new FileReader(request));
		String input;
		handle = new HANDLER();
	
		while( (input = br.readLine()) != null )
			handle.handles(input);
		br.close();
		//@end
	}
		
}
