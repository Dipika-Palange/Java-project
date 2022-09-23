package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws FileNotFoundException,IOException  {
		Employee employee=new Employee(101, "Manas");
		
		FileOutputStream outputstream=new FileOutputStream("D:\\Java\\ser.txt");
		ObjectOutputStream objectoutputstream=new ObjectOutputStream(outputstream);
		objectoutputstream.writeObject("employee");
		outputstream.flush();
		
		System.out.println("Converted into stream");
	}
	

}
