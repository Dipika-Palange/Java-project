package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub


	ObjectInputStream objectinputstream=new ObjectInputStream(new FileInputStream("D:\\Java\\ser.txt"));
		 
		Employee employee=(Employee)objectinputstream.readObject();
		System.out.println(employee);
		
		
		objectinputstream.close();
	}

}
