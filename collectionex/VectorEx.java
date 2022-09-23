package collectionex;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vector=new Vector<String>();
		vector.addElement("Nupur");
		vector.add("Nisha");
		vector.add("Riya");
		vector.add("Jay");
		vector.add("Riya");
		
	Enumeration<String> em=vector.elements();
			while(em.hasMoreElements())
			{
				System.out.println(em.nextElement());
			}
	}

}
