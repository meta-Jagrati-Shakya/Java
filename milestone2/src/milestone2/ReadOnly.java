package milestone2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnly {

	public static void main(String[] args) {
		List<Integer>arr=new ArrayList<Integer>();
		arr.add(20);
		arr.add(30);
		arr.add(50);
		arr.add(70);
		arr.add(10);
		arr.add(90);
		System.out.println("Original arraylist "+arr);
		arr=Collections.unmodifiableList(arr);
		System.out.println("List is now read-only");
		try {
			System.out.println("\nTry block is trying to execute\narr.add(45);");
			arr.add(45);
		}catch(Exception e) {
			System.out.println("\nNot able to add in the list");
		}
		
	}

}
