public class MethodPractice {
	public static void main(String[] args) {
		System.out.println("Hello this is a mac.");
		
		// Define a variable called name.
		String name = "steve";
		
		// Pass the name to a method that makes a greeting.
		// Keep the greeting as a string.
		String greetings = HelloSteve(name);
		
		// print the greeting.
		System.out.println(greetings);
	}
	
	public static String HelloSteve (String name){
		String greetings;
		String frontOfGreeting = "Hello ";
		String backOfGreeting = ", nice to meet you.";
		
		greetings = frontOfGreeting + name + backOfGreeting;
		
		return greetings;
	}

}
