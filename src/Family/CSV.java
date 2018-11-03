package Family;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CSV {

	CSV(String name, String lname, String food, String hobby, int age) throws FileNotFoundException {
		// (new FileOutputStream( new File("persons.txt")
		File f = new File("test.csv");
		PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));

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

}
