package Family;

import java.io.FileNotFoundException;
import java.util.*;

public class Member {
	private static Scanner inputFromUser;
	private static Scanner inputwords;
	
	// main method
	public void addMember() throws FileNotFoundException {
		// input name
		System.out.println("Enter a name of Member :");
		inputFromUser = new Scanner(System.in);
		inputwords = new Scanner(System.in);
		String name = inputwords.nextLine();
		System.out.println(name);

		System.out.println("Enter a Last name of Member :");
		inputFromUser = new Scanner(System.in);
		inputwords = new Scanner(System.in);
		String lastname = inputwords.nextLine();
		System.out.println(lastname);

		System.out.println("Enter a favorite Food :");
		inputFromUser = new Scanner(System.in);
		inputwords = new Scanner(System.in);
		String food = inputwords.nextLine();
		System.out.println(food);

		System.out.println("Enter a favorite Hobby :");
		inputFromUser = new Scanner(System.in);
		inputwords = new Scanner(System.in);
		String hobby = inputwords.nextLine();
		System.out.println(hobby);

		System.out.println("Enter an age of Member :");
		inputFromUser = new Scanner(System.in);
		inputwords = new Scanner(System.in);
		int age = inputwords.nextInt();
		System.out.println(age);
		
		CSV csv = new CSV(name, lastname, food, hobby, age);

	}
}
