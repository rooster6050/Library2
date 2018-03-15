package libraryPackage;

import java.util.ArrayList;

public class LibraryManager 
{
	
	private ArrayList<Person> people = new ArrayList<>();
	private ArrayList<LibraryItem> stock = new ArrayList<>();
	
	public void addItem(LibraryItem item)
	{
		stock.add(item);
		System.out.println(item.getName()+ " was added to the Library with ID: " + item.getID());
	}
	
	public void removeItem(LibraryItem item)
	{
		stock.remove(item);
		System.out.println(item.getName()+ " was removed from the Library");
	}
	
	public void registerPerson(Person person)
	{
		people.add(person);
		System.out.println(person.getName()+ " was registered at the Library with ID: " + person.getID());
	}
	
	public void removePerson(Person person)
	{
		people.remove(person);
		System.out.println(person.getName()+ " was unregistered from the Library");
	}
	
	public void updateItem(LibraryItem item, LibraryItem updateItem)
	{
		for(int i=0; i<stock.size();i++)
		{
			if(stock.get(i)==item)
			{
				System.out.println(stock.get(i).getName()+ " was updated");
				stock.set(i, updateItem);
			}
		}
	}
	
	public void updatePerson(Person person, Person updatePerson)
	{
		for(int i=0;i<people.size();i++)
		{
			if(people.get(i)==person)
			{
				System.out.println(people.get(i).getName()+ " was updated");
				people.set(i, updatePerson);
			}
		}
	}
	
	public void checkOutItem(LibraryItem item, Person person)
	{
		if(item.isCheckedout()==false)
		{
		item.setCheckedout(true);
		item.setCheckedOutBy(person);
		System.out.println(item.getName() + " ID: " + item.getID() + " was checked out to " + person.getName());
		}
		else
		{
			System.out.println("Item is already checked out by: " + item.getCheckedOutBy().getName());
		}
	}
	
	public void checkInItem(LibraryItem item, Person person)
	{
		if(item.getCheckedOutBy()==person)
		{
		person.returnItem(item);
		System.out.println(item.getName() + " was checked in by " + person.getName());
		}
		else if(item.isCheckedout()==false)
		{
			System.out.println("Tried to check in: " + item.getName()+" but it was not checked out");
		}
		else System.out.println(item.getName()+" is not checked out by "+person.getName() + ", it is checked out by " + item.getCheckedOutBy().getName());
	}
	
	public void printItemStatus()
	{
		for(LibraryItem temp:stock)
		{
			System.out.print(temp.getName()+": ID: " + temp.getID());
			if(temp.isCheckedout())
			{
				System.out.println(" is checked out by: " + temp.getCheckedOutBy().getName());
			}
			else
			{
			System.out.println(" is not currently checked out");
			}
			
		}
	}
	
	public void reset()
	{
		people.clear();
		stock.clear();
		System.out.println("Library was reset");
	}
}
