//Shrirang Adgaonkar
package sad.adgaonkar.shrirang;

public class PUBLISHER extends ITEM 
{

	protected String retailer;
	protected String brand;

	public PUBLISHER(String retailer, String brand, String type)
	{
		//@begin
		super(type);
		this.retailer=retailer;
		this.brand=brand;
		//@end
	}

}
