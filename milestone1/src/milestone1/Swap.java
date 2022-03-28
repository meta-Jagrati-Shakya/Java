package milestone1;

import java.util.Collections;
import java.util.Vector;

public class Swap {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("My");
		v.add("name");
		v.add("is");
		v.add("Jagg");
		
		System.out.println("Befor Swap vetor:\n"+v);
		String atIndexTwo=v.get(2);
		v.set(2, v.get(0));
		v.set(0,atIndexTwo);
		System.out.println("After Swap vector:\n"+v);
		
		System.out.println("\nUsing Collections method");
		Collections.swap(v, 0, 2);
		System.out.println("after swapping using collections method:\n"+v);
		
	}
}
