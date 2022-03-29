package milestone3;

import java.util.ArrayList;

public class GenericClass<T> {
	
	private ArrayList<T> genericArray=new ArrayList<T>();
	
	public void add(T ob) {
		genericArray.add(ob);
	}
	
	public void deleteFromAnIndex(int idx) {
		genericArray.remove(idx);
	}
	
	public void update(int idx,T ob) {
		genericArray.set(idx, ob);
	}

	public ArrayList<T> getGenericArray() {
		return genericArray;
	}
}