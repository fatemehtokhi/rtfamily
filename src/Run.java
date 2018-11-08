
import java.io.IOException;
import java.util.Scanner;

import Family.CSV;
import Family.Member;
import Family.PrintCsv;

public class Run {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		System.out.println("1. Add Members");
		System.out.println("2. prints Members ");
		System.out.println("3.search Members by name ");

		System.out.println("Choose an option");
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
			s.search(1, "hamraz");
		}

	}

}
