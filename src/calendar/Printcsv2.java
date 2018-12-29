package calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printcsv2 {
	

		public void read() throws FileNotFoundException {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(new File("calendar.csv"));
	        scanner.useDelimiter(" ,");
	        while(scanner.hasNext()){
	            System.out.print(scanner.next()+"|");
	        }
	        scanner.close();

		}

	}



