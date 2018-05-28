package test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.MyPOJO;

public class JSONtoObject {
	public static void main(String[] args) {
		
		File file = new File("company.json");
//		String jsonString = "{\n" + 
//				"	\"company\": {\n" + 
//				"		\"compid\": \"1001\",\n" + 
//				"		\"employees\": [\n" + 
//				"			{\n" + 
//				"				\"name\": \"John\",\n" + 
//				"				\"id\": \"101\",\n" + 
//				"				\"designation\": \"Developer\"\n" + 
//				"			},\n" + 
//				"			{\n" + 
//				"				\"name\": \"Tom\",\n" + 
//				"				\"id\": \"102\",\n" + 
//				"				\"designation\": \"QA\"\n" + 
//				"			}\n" + 
//				"		]\n" + 
//				"	}\n" + 
//				"}";
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			MyPOJO myPOJO = mapper.readValue(file, MyPOJO.class);
//			MyPOJO myPOJO = mapper.readValue(jsonString, MyPOJO.class);
		
			System.out.println("Company id : "  + myPOJO.getCompany().getCompid());
			System.out.println("Employee 1 : " + myPOJO.getCompany().getEmployees()[0]);
			System.out.println("Employee 2 : " + myPOJO.getCompany().getEmployees()[1]);
		
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
