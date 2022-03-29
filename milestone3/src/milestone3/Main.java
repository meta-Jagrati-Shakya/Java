package milestone3;

import java.util.ArrayList;

public class Main {

	/*
	 * Generic method to display the objects
	 */
	static <T> void genericDisplay(ArrayList<T> array){
		for(T ob:array) {
			System.out.println(ob);
		}
		System.out.println();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		
		GenericClass gcEmpty=new GenericClass();
		gcEmpty.add(34);
		gcEmpty.add("this is a string");
		gcEmpty.add(56.876);
		
		ArrayList ar=gcEmpty.getGenericArray();
		int a=(Integer)ar.get(0);
		String b=(String)ar.get(1);
		double c=(double)ar.get(2);
		
		genericDisplay(gcEmpty.getGenericArray());
		
		GenericClass<Employee> gc=new GenericClass<Employee>();
		gc.add(new Employee("fname","lname",23,234.99));
		gc.add(new Employee("fname2","lname2",23,234.99));
		gc.add(new Employee("fname3","lname3",23,234.99));
		gc.add(new Employee("fname4","lname4",23,234.99));
		gc.add(new Employee("fname5","lname5",23,234.99));
		
		ArrayList<Employee> ar1=gc.getGenericArray();
		Employee e=ar1.get(0);
		
		genericDisplay(gc.getGenericArray());
		gc.deleteFromAnIndex(2);
		genericDisplay(gc.getGenericArray());
		
		GenericClass<Integer> gcInt=new GenericClass<Integer>();
		gcInt.add(34);
		gcInt.add(50);
		gcInt.add(56);
		gcInt.add(47);
		
		genericDisplay(gcInt.getGenericArray());
	}

}


