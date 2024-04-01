package week6.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {

	
	public static void main(String[] args) throws IOException {
		//Create object for FileInputStream
		//method 1
//		FileInputStream fis = new FileInputStream(new File("src/main/resources/Credentials.properties"));
		
		//method 2
		FileInputStream fis = new FileInputStream("src/main/resources/Credentials.properties");
		
		//Create object for Properties class
		Properties prop = new Properties();
		
		//Load the properties file into the properties class
		prop.load(fis);
		
		// get the value based on the key
		
		String un = prop.getProperty("username");
		System.out.println(un);
		String pwd = prop.getProperty("password");
		System.out.println(pwd);
		
		String user = prop.getProperty("user");
		System.out.println(user);
		
		String name = "";
		System.out.println(name);
		name = name+"Testleaf";
		System.out.println(name);
		name = "Qeagle";
		System.out.println(name);
	}
	
	
}
