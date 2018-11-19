
import java.io.IOException;
import java.util.Scanner;

import Family.CSV;
import Family.Member;
import Family.PrintCsv;

public class Run {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		System.out.println("Choose an option");

		System.out.println("1. Add Members");
		System.out.println("2. prints Members ");
		System.out.println("3.search Members by name ");

		
		Scanner inputFromUser = new Scanner(System.in);
		Scanner inputwords = new Scanner(System.in);
		int number = inputwords.nextInt();

		if (number == 1) {

			Member m = new Member();
			m.addMember();
		}

		else if (number == 2) {
			PrintCsv csv = new PrintCsv();
			csv.read();

		} else {
			CSV s = new CSV();
			 
			System.out.println("0. Search by name ");
			System.out.println("1. Search by Lastname");
			System.out.println("2. Search by Food");
			System.out.println("3. Search by Hobby");
			System.out.println("4. Search by Age");
		
			int input = inputwords.nextInt();
			
			 if (input == 0) {
				 System.out.println("Enter your name ");
				 String name = inputwords.next();
				 s.search(0,name);
				 
				 
				
			}
			else if (input == 1) {
				 System.out.println("Enter your lastname ");
				 String lname = inputwords.next();
				s.search(1, lname);
							
			}
			else if (input == 2) {
				 System.out.println("Enter your food");
				 String food = inputwords.next();
				 s.search(2, food);
				
			}
			else if (input == 3) {
				 System.out.println("Enter your hobby ");
				 String hobby = inputwords.next();
				s.search(3, hobby);
				
			}
			else if (input == 4) {
				 System.out.println("Enter your age ");
				 String age= inputwords.next();
				s.search(4, age);
				
			}
			
		
		}

	}

}
