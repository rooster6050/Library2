package libraryPackage;

import java.util.Scanner;

public class InputHandler {

	public InputHandler() 
	{
		
	}
	
	static public int getInt()
	{
		return Integer.parseInt(sc.nextLine());
	}
	
	static public String getString()
	{
		return sc.nextLine();
	}

	static private Scanner sc = new Scanner(System.in);
}
