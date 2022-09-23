package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream outputstream=new FileOutputStream("D:\\Java\\abc.txt",true);
		String str=",welcome To Edubridge";
		byte barr[]=str.getBytes();
		outputstream.write(barr);
		outputstream.close();
		
		System.out.println("File Created");
	}

}