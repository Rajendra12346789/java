package in.nit.workshop;

public class person {

	//static variables
	public static String country;
	public static String state;
	
	
	public static void displayInformation() {
		System.out.println("display method is invovked");
		
	}
	
	public void getInformation() {
		System.out.println("invoking non static methods");
	}
}

