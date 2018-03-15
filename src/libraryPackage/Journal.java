package libraryPackage;

public class Journal extends LibraryItem {

	public Journal(String name, boolean peerReviewedIn) 
	{
		super(name);
		peerReviewed = peerReviewedIn;
	}
	
	public String outputDetails()
	{
		return ("ID: "+ getID() + " Name: " + getName()+ " Is peer reviewed+ " + peerReviewed);
	}
	
	private boolean peerReviewed;

}
