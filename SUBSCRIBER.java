//Shrirang Adgaonkar
package sad.adgaonkar.shrirang;

public class SUBSCRIBER extends ITEM 
{

	protected String customer;

	public SUBSCRIBER(String customer, String type) 
	{
		//@begin
		super(type);
		this.customer=customer;
		//@end
	}

}
