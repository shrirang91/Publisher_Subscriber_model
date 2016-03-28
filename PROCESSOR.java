//Shrirang Adgaonkar
package sad.adgaonkar.shrirang;
import java.util.*;

public class PROCESSOR 
{

	protected static HashSet<SUBSCRIBER> subscriptionList = new HashSet<SUBSCRIBER>();

	public void publish(PUBLISHER item) 
	{
		//@begin
		Iterator<SUBSCRIBER> i = subscriptionList.iterator();
		while( i.hasNext() )
		{
			SUBSCRIBER current = i.next();
			if( item.type.equals( current.type ) )
				System.out.println(current.customer+" notified of "+item.brand+" from "+item.retailer);
		}
		//@end
	}
	public void subscribe(SUBSCRIBER add) 
	{
		//@begin
		Iterator<SUBSCRIBER> i = subscriptionList.iterator();
			while(i.hasNext())
			{
				SUBSCRIBER current = i.next();
				if( current.customer.equals(add.customer) && current.type.equals(add.type) )
					return;
			}
			subscriptionList.add(add);
		//@end	
	}
	
	public void unsubscribe(SUBSCRIBER delete) 
	{
		//@begin
		Iterator<SUBSCRIBER> i = subscriptionList.iterator();
		while(i.hasNext())
		{
			SUBSCRIBER current = i.next();
			if( current.customer.equals(delete.customer) && current.type.equals(delete.type) )
				return;
		}
		subscriptionList.remove(delete);
		//@end
	}

	
}
