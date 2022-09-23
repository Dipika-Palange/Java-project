package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		FileWriter  writer=new FileWriter("D:\\Java\\xyz.txt",true);
		writer.write("This is String Oriented");
		writer.close();
		
		System.out.println("File Created");
	}

}
