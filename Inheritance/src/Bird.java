/*
 * The super class of all the other birds
 */

public class Bird {
	public String colour = "Basic Colour";
	public int numLegs = 2;
	public String sound = "tweet";
	private String privateField = "You can't see me";  // this is private, so we'll see if it is inherited

	public static void sayHello(){
		System.out.println("Hi! I am a bird");
	}
	
	public static void wingFlap(){
		System.out.println("Wings are flapping");
	}
	
	public static void callSound(){
		System.out.println("Tweet, tweet");
	}

	private static void privateMethod(){
		System.out.println("You can't use this");
	}
}
