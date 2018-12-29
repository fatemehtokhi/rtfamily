package calendar;

import java.io.IOException;
import java.util.Scanner;

import Family.CSV;

public class Run2 {
	public static void main(String[] args) throws IOException {

		System.out.println("Choose an Option");
		System.out.println("1.Add Members");
		System.out.println("2.prints Members");
		System.out.println("3.search Members by Name");
		
		
		Scanner inputFromUser = new Scanner(System.in);
		Scanner inputwords = new Scanner(System.in);
		int number = inputwords.nextInt();
		
		
		if(number == 1) {
			Subject s = new Subject();
			s.addsubject();
			
		}
		else if (number ==2) {
			
			Printcsv2 csv2 = new Printcsv2 ();
			csv2.read();
			
			
		}
		else {
			CSV2 s = new CSV2(null, null, null, null);
			 
			System.out.println("0. Search by name ");
			System.out.println("1. Search by subject");
			System.out.println("2. Search by date");
			System.out.println("3. Search by dateinfromed");
			
		
			int input = inputwords.nextInt();
			
			 if (input == 0) {
				 System.out.println("Enter your name ");
				 String name = inputwords.next();
				 s.search(0,name);
		 }else if (input == 1) {
				 System.out.println("Enter your subject");
				 String subject = inputwords.next();
				s.search(1, subject);
		 }else if (input == 2) {
				System.out.println("Enter your date");
				String date = inputwords.next();
				s.search(2,date);
		 }else if (input == 3) {  	
				System.out.println("Enter your dateinformed");
				String dateinformed = inputwords.next();
				s.search(3, dateinformed);
		 }
	}
	}

			 

}

	


	
	
