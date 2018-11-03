package tutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {
	private static Scanner inputFromUser;
	private static Scanner inputwords;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 0;
		System.out.println("Enter an Integer : ");
		inputFromUser = new Scanner(System.in);
		
		
		int finish = 0;
		//while(finish <=0) {
			if(inputFromUser.hasNextInt()) {
					finish = inputFromUser.nextInt();
				System.out.println("Enter a String : ");
			}else {
				 finish = 1;
				System.out.println("Play the rules, Enter an int");
				
				
		
			}
		
		
		inputwords = new Scanner(System.in);
		String words = inputwords.nextLine();
		
		
		while (start < finish) {
			System.out.println(words);
		
			start += 1;
		}
		
		

	}



}

