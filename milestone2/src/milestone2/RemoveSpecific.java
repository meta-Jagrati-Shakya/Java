package milestone2;

import java.util.ArrayList;

public class RemoveSpecific {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//remove a specific element from the collection
		ArrayList<Integer>arr=new ArrayList<Integer>();
		arr.add(20);
		arr.add(30);
		arr.add(50);
		arr.add(70);
		arr.add(10);
		arr.add(90);
		System.out.println("Original arraylist");
		System.out.println(arr+"\n");
	
		System.out.println("Remove specific value in the arraylist");	
		arr.remove(new Integer(90));
		System.out.println(arr+"\n");
		
		System.out.println("Remove element on specific index");
		arr.remove(3);
		System.out.println(arr+"\n");
		
		System.out.println("Remove element with condition");
		arr.removeIf(n->(n==50));
		System.out.println(arr);
		
	}

}
