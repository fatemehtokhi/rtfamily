package Family;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
//import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWriter {  

  public static void main(String[] args) throws FileNotFoundException {  

    Member member2 = new Member();  
   
    member2.addMember(); 

   // List<String> listOfStates = new ArrayList<String>();  
    //istOfStates.add("Madhya Pradesh");  
    //listOfStates.add("Maharastra");  
    //listOfStates.add("Rajasthan");  

  //  member.states = listOfStates ;  
    ObjectMapper objectMapper = new ObjectMapper();
    try {
		objectMapper.writeValue(new File("members.json"), member2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    //mapper.writeValue(new File("member.json"), member);
  }  
}