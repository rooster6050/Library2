package libraryPackage;

public class Magazine extends LibraryItem {

	public Magazine(String name, int editionIn) 
	{
		super(name);
		edition = editionIn;
		// TODO Auto-generated constructor stub
	}
	
	public String outputDetails()
	{
		return ("ID: "+ getID() + " Name: " + getName()+ " Edition: " + edition);
	}
	
	private int edition;

}
