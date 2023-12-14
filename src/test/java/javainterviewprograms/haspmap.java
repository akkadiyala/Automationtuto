package javainterviewprograms;

import java.util.HashMap;
import java.util.Map;

public class haspmap {

	public static void main(String[] args) {
		 Map<Integer, String> hashmap = new HashMap<>();
		 hashmap.put(1 , " anil ");
		 hashmap.put(2 , " kumar ");
		 hashmap.put(3, "chowdary");
		 hashmap.put(4, "kadiyala");
		 System.out.println(hashmap);
		 System.out.println("");
		 System.out.println("print using for loop ");
		 
	int size=	 hashmap.size();
	for(int i = 1; i<= size;i++ )
		System.out.println("key "+ i + " value is "  + hashmap.get(i));
	System.out.println("");
	System.out.print("[");
	for(int i = 1; i<= size;i++ )
	{
		System.out.print(hashmap.get(i));
	if(  i< size) {
		System.out.print(" , ");
	}
	
	
	
	}
	System.out.print("]");
	System.out.println("");
	 System.out.println("print using foreach loop ");
		 for(Map.Entry<Integer, String> value : hashmap.entrySet()) {
			 System.out.println(" Key " + value.getKey() + " value is "+ value.getValue());
		 }
	}
}
