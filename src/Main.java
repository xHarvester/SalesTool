public class Main {
	
	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		Main.displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("Hello happy sales people");
		System.out.println("This app shows sale data");
		System.out.println("-------------------------");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}
}
