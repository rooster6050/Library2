package libraryPackage;

public abstract class LibraryItem 
{	
	public LibraryItem(String name) 
	{
		super();
		ID = nextID;
		nextID++;
		this.name = name;
		isCheckedout = false;
		checkedOutBy = null;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCheckedout() {
		return isCheckedout;
	}
	public void setCheckedout(boolean isCheckedout) {
		this.isCheckedout = isCheckedout;
	}
	public Person getCheckedOutBy() {
		return checkedOutBy;
	}
	public void setCheckedOutBy(Person checkedOutBy) {
		this.checkedOutBy = checkedOutBy;
	}
	
	public String outputDetails()
	{
		return ("ID: "+ ID + " Name: " + name);
	}
	
	private int ID;
	private String name;
	private boolean isCheckedout;
	private Person checkedOutBy;
	static private int nextID = 0;

}
