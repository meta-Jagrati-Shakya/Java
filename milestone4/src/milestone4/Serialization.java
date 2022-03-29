package milestone4;

import java.io.*;

public class Serialization {

	public static void main(String[] args) {
		
		Serialized sr = new Serialized("fname", "lname", 456, 65747.56);

		// serialization
		try {
			System.out.println("Serializing the Object\n");
			
			FileOutputStream fo = new FileOutputStream("file.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fo);
			obj.writeObject(sr);
			
			obj.close();
			fo.close();

		} catch (IOException e) {
			
			System.out.println("IO Error in serializing the object");
		}

		// deserialization
		try {
			System.out.println("Deserializing the Object\n");

			FileInputStream fis = new FileInputStream("file.txt");
			ObjectInputStream objIn = new ObjectInputStream(fis);
			Serialized deserializedObj = (Serialized) objIn.readObject();

			objIn.close();
			fis.close();

			System.out.println(deserializedObj.toString());

		} catch (IOException e) {
			
			System.out.println("IO Error in deserializing the object");
			
		} 
		catch (ClassNotFoundException e) {
			
			System.out.println("Class Not Found Error in deserializing the object");
			
		}

	}

}
