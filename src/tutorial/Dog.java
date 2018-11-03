package tutorial;

public class Dog {
	
	
	String name;
	int breed;
	
	
	
	
	Dog ( String n,int  b){
		
		name = n;
		breed = b;
		
	}
	void printname () {
		System.out.println( "This is a Name of Dog :" +name);
		
	}
	
	void printbreed () {
		System.out.println("This is a Breed of Dog :" +breed);
	}
	
	
	void barke() {
		System.out.print(" Woof ");
		}
	
	void roer() {
		System.out.print(" Wah ");
	}

}
