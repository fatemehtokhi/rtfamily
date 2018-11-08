package Family;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintCsv {

	public void read() throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("test.csv"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"|");
        }
        scanner.close();

	}

}
