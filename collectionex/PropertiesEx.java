package collectionex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\JAVA\\src\\collectionex\\db.properties");
		Properties p=new Properties();
		p.load(reader);
		
	
		System.out.println("Username: "+p.getProperty("username"));

		System.out.println("Password: "+p.getProperty("password"));
	}

}
