package calendar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CSV2 {
	private File f;
	CSV2(String name,String subject, String date,String dateinformed) throws FileNotFoundException{
		File f = new File("calendar.csv");
		PrintWriter pw = new PrintWriter (new FileOutputStream (f,true));
	
	
	StringBuilder sb = new StringBuilder();
		
	if (f.length() == 0) {
			sb.append("Name");
			sb.append(',');
			sb.append("Subject");
			sb.append(',');
			sb.append("Date");
			sb.append(',');
			sb.append("Dateinformed");
			sb.append('\n');
			
		}
			sb.append(name);
			sb.append(',');
			sb.append(subject);
			sb.append(',');
			sb.append (date);
			sb.append(',');
			sb.append(dateinformed);
			sb.append('\n');
			
			
			pw.write(sb.toString());
			pw.close();
			System.out.println("Done");
   
	
	}
	public CSV2() {
		// TODO Auto-generated constructor stub
	}
	public void search(int searchColumnIndex, String searchString) throws IOException {
		String resultRow = null;
		BufferedReader br = new BufferedReader(new FileReader("calendar.csv"));
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