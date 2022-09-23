package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream inputstream=new FileInputStream("D:\\Java\\abc.txt");
		int i=0;
		while((i=inputstream.read())!=-1)
		{
			System.out.print((char)i);
		}
		inputstream.close();
	}

}
