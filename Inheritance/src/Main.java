/**
 * Simple program to understand the concept of inheritance
 * 
 * @author Atif Mahmud
 * Date: 3rd June, 2017
 */

public class Main {
	public static void main(String[] args){
		Bird.sayHello();
		Sparrow.sayHello();
		//Bird.privateMethod(); NOT VISIBLE
		//System.out.println(Bird.privateField); NOT VISIBLE
		Sparrow.wingFlap();
		
		Bird MyBird = new Bird();
		Bird MyChidiya = new Sparrow();
		polymorphicArgMethod(MyBird);
		polymorphicArgMethod(MyChidiya);
		
		
		Bird BirdArray[] = new Bird [4];
		BirdArray[0] = new Sparrow();
		
		System.out.println("\nHope to see a sparrow!");
		BirdArray[0].sayHello();
	
	}
	
	
	// Demonstrate polymorphic argument
	public static void polymorphicArgMethod(Bird bird){
		bird.sayHello();
	}
			
}