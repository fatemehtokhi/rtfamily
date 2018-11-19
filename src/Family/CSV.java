package Family;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSV {
	private File f;

	public CSV() {

	}

	CSV(String name, String lname, String food, String hobby, int age) throws FileNotFoundException {
		// (new FileOutputStream( new File("persons.txt")
		File f = new File("test.csv");// here we have a object from file.File (Path or name of file that we create)
		PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));// class PrintWriter takes input and then transfers to file.in This program our file is object "f".

		StringBuilder sb = new StringBuilder();

		if (f.length() == 0) {
			sb.append("Name");
			sb.append(',');
			sb.append("Lastname");
			sb.append(',');
			sb.append("Food");
			sb.append(',');
			sb.append("Hobby");
			sb.append(',');
			sb.append("Age");
			sb.append('\n');

		}

		sb.append(name);
		sb.append(',');
		sb.append(lname);
		sb.append(',');
		sb.append(food);
		sb.append(',');
		sb.append(hobby);
		sb.append(',');
		sb.append(age);
		sb.append('\n');

		pw.write(sb.toString());
		pw.close();
		System.out.println("Done");
	}

	public void search(int searchColumnIndex, String searchString) throws IOException {
		String resultRow = null;
		BufferedReader br = new BufferedReader(new FileReader("test.csv"));
		String line;
		while ((line = br.readLine()) != null) {
			String[] values = line.split(",");
			System.out.println(searchColumnIndex);
			if (values[searchColumnIndex].equals(searchString)) {
				resultRow = line;
				break;
			}
			
		}
		br.close();
		System.out.println(resultRow);

	}

}
