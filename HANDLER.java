//Shrirang Adgaonkar
package sad.adgaonkar.shrirang;

public class HANDLER 
{

	protected PROCESSOR access;

	public void handles(String request) 
	{
		//@begin
		access=new PROCESSOR();
		String bucket[] = request.split(",");
		if( bucket[0].toLowerCase().equals("subscribe") )
		{
			SUBSCRIBER sub = new SUBSCRIBER(bucket[1].toLowerCase().trim(),bucket[2].toLowerCase().trim());
			access.subscribe(sub);
		}
		else if( bucket[0].toLowerCase().equals("unsubscribe") )
		{
			SUBSCRIBER sub = new SUBSCRIBER(bucket[1].toLowerCase().trim(),bucket[2].toLowerCase().trim());
			access.unsubscribe(sub);;
		}
		else
		{
			PUBLISHER pub = new PUBLISHER(bucket[1].toLowerCase().trim(), bucket[3].toLowerCase().trim(), bucket[2].toLowerCase().trim());
			access.publish(pub);
		}
		return;
		//@end
	}

}
