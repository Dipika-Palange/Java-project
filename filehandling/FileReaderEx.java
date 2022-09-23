package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader reader=new FileReader("D:\\Java\\xyz.txt");
		int i=0;
		while((i=reader.read())!=-1)
		{
			System.out.print((char)i);
		}
		reader.close();
	}

}
