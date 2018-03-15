package libraryPackage;

public class LibraryItemFactory {

	public LibraryItemFactory() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static LibraryItem makeLibraryItem(String type, String name, int pages, int edition, boolean peerReviewed)
	{
		if("book".equalsIgnoreCase(type)) return new Book(name, pages);
		else if("magazine".equalsIgnoreCase(type)) return new Magazine(name, edition);
		else if("journal".equalsIgnoreCase(type)) return new Journal(name, peerReviewed);
		System.out.println("Invalid item type");
		return null;
		
	}

}
