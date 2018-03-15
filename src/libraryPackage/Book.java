package libraryPackage;

public class Book extends LibraryItem {

	public Book(String name, int pagesIn) 
	{
		super(name);
		pages = pagesIn;
	}
	
	public String outputDetails()
	{
		return ("ID: "+ getID() + " Name: " + getName()+ " Pages: " + pages);
	}
	
	public int pages;

}
