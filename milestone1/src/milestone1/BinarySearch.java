package milestone1;

import java.util.Collections;
import java.util.Vector;

public class BinarySearch {
	
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("My");
		v.add("name");
		v.add("is");
		v.add("Jagg");
		v.add("Have");
		v.add("courage");
		v.add("be");
		v.add("strong");
		
		Collections.sort(v);
		int idx=Collections.binarySearch(v,"be");
		System.out.println("Sorted vector: "+v);
		System.out.println(idx);
		
	}

}
