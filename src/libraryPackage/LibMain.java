package libraryPackage;

public class LibMain {
	
	static private LibraryManager library = new LibraryManager();
	
	public static void RunTests()
	{
		System.out.println("Creating items");
		LibraryItem theLastWish = LibraryItemFactory.makeLibraryItem("book", "The Last Wish", 365, 0, false);
		LibraryItem gameOfThrones = LibraryItemFactory.makeLibraryItem("book", "Game ov Thrones", 1000, 0, false);
		LibraryItem topGearMagazine = LibraryItemFactory.makeLibraryItem("MAGaZINE", "Top Gear Magazine", 80, 5, true);
		LibraryItem scienceyJournal = LibraryItemFactory.makeLibraryItem("journAL", "Science Journal", 50, 1, true);	
		
		System.out.println("Creating people");
		Person edward = new Person("Ed");
		Person elvis = new Person("Elvis");
		
		System.out.println("Adding items");
		library.addItem(topGearMagazine);
		library.addItem(theLastWish);
		library.addItem(gameOfThrones);
		library.addItem(scienceyJournal);
		
		System.out.println("Adding people");
		library.registerPerson(edward);
		library.registerPerson(elvis);
		
		library.checkOutItem(theLastWish, edward);
		library.checkOutItem(gameOfThrones, elvis);
		library.checkOutItem(scienceyJournal, elvis);
		library.checkInItem(topGearMagazine, elvis);
		
		library.printItemStatus();	
		
		library.checkInItem(theLastWish, elvis);
		library.checkInItem(gameOfThrones, elvis);
		library.checkOutItem(gameOfThrones, edward);
		
		library.printItemStatus();
		
		library.updateItem(gameOfThrones, LibraryItemFactory.makeLibraryItem("book", "Game of Thrones", 1000, 0, false));
		library.printItemStatus();
		
		library.reset();
	}
	
	public static void addItem()
	{
		System.out.println("Please enter an item type: Book, Magazine or Journal");
		String input = InputHandler.getString();
		if(input.equalsIgnoreCase("book"))
		{
			System.out.println("Please enter the name");
			String name = InputHandler.getString();
			System.out.println("Please enter the number of pages");
			int pages = InputHandler.getInt();
			library.addItem(LibraryItemFactory.makeLibraryItem(input,name,pages,0,false));
		}
		else if(input.equalsIgnoreCase("magazine"))
		{
			System.out.println("Please enter the name");
			String name = InputHandler.getString();
			System.out.println("Please enter the edition");
			int edition = InputHandler.getInt();
			library.addItem(LibraryItemFactory.makeLibraryItem(input,name,0,edition,false));
		}
		else if(input.equalsIgnoreCase("journal"))
		{
			System.out.println("Please enter the name");
			String name = InputHandler.getString();
			System.out.println("Is it peer reviewed? Type Y or N");
			char peer = InputHandler.getString().charAt(0);
			if(peer=='Y')
			{
				library.addItem(LibraryItemFactory.makeLibraryItem(input,name,0,0,true));
			}
			
			if(peer=='N')
			{
				library.addItem(LibraryItemFactory.makeLibraryItem(input,name,0,0,false));
			}
			else 
			{
			System.out.println("Not a valid input, try again");
			addItem();
			}

		}
		else
		{
			System.out.println("Not a valid input, try again");
			addItem();
		}
		
	}
	
	public static void displayMenu()
	{
		System.out.println("Welcome to the library!");
		System.out.println("Press 1 to run the tests");
		System.out.println("Press 2 to add an item");
		System.out.println("Press 3 to add a person");
		System.out.println("Press 4 to check out a book");
		System.out.println("Press 5 to return out a book");		
		System.out.println("Press 6 to exit");
		int choice = InputHandler.getInt();
		switch(choice)
		{
		case 1: RunTests();
		break;
		case 2: addItem();
			break;
		case 6: System.exit(0);
		default: 
			break;
		}
	}

	public static void main(String[] args) 
	{	

		displayMenu();
		
	}

}
