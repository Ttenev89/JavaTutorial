
public class Lesson1 {
	
	public static void main(String[]args) {
		System.out.println("Program start.\n");
		printFirstName();
		printLastName();
		addNames();
		System.out.println("\nProgram end.");
	}
	
	public static void printFirstName() {
		System.out.println("My first name is Tihomir.");
		System.out.println("I realy like football.");
	}
	
	public static void printLastName() {
		System.out.println("My last name is Tenev.");
	}
	
	public static void addNames() {
		int tihomir = 7;
		int tenev = 5;
		int sum;
		
		sum = tihomir + tenev;
		
		System.out.println("The number of letters in your full name is: " + sum);
	}
}
