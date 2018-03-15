package libraryPackage;

import java.util.ArrayList;

public class Person 
{
	
	public Person(String nameIn)
	{
		name = nameIn;
		ID = nextID;
		nextID++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public static int getNextID() {
		return nextID;
	}

	public static void setNextID(int nextID) {
		Person.nextID = nextID;
	}

	public ArrayList<LibraryItem> getItemsCheckedOut() {
		return itemsCheckedOut;
	}

	public void setItemsCheckedOut(ArrayList<LibraryItem> itemsCheckedOut) {
		this.itemsCheckedOut = itemsCheckedOut;
	}

	private String name;
	private int ID;
	static private int nextID = 0;
	private ArrayList<LibraryItem> itemsCheckedOut = new ArrayList<>();
	
	public void takeItem(LibraryItem item)
	{
		itemsCheckedOut.add(item);
	}
	
	public void returnItem(LibraryItem item)
	{
		item.setCheckedout(false);
		itemsCheckedOut.remove(item);
		item.setCheckedOutBy(null);
	}
	
	public void outputItems()
	{
		System.out.println(name + ": ID: " + ID + " has items:");
		if(!itemsCheckedOut.isEmpty())
		{
		for(LibraryItem temp: itemsCheckedOut)
		{
			System.out.println(temp.getName());
		}
		}
		else
			System.out.println(name + ": ID: " + ID + " has no items");
	}

}
