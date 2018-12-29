package calendar;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Subject {
	private static Scanner inputFromUser;
	private static Scanner inputWords;
	
	public void addsubject () throws FileNotFoundException {
		System.out.println("Enter a Name : ");
		inputFromUser = new Scanner(System.in);
		inputWords = new Scanner(System.in);
		String name = inputWords.nextLine();	
		System.out.println(name);
		
		System.out.println("Enter a Subject :");
		inputFromUser = new Scanner(System.in);
		inputWords = new Scanner(System.in);
		String subject = inputWords.nextLine();
		System.out.println(subject);
		
		System.out.println("Enter a Date");
		inputFromUser = new Scanner(System.in);
		inputWords = new Scanner(System.in);
		String date = inputWords.nextLine();
		System.out.println(date);
		
		System.out.println("Enter date of infrom");
		inputFromUser = new Scanner(System.in);
		inputWords = new Scanner(System.in);
		String dateinformed = inputWords.nextLine();
		System.out.println(dateinformed);
		  
		CSV2 csv2 = new CSV2(name ,subject, date, dateinformed);
	}
}