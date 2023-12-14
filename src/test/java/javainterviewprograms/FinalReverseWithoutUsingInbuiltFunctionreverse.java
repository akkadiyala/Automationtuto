package javainterviewprograms;

public class FinalReverseWithoutUsingInbuiltFunctionreverse {
public static void main(String[] args) {
	

	String str = "anil kumar";
	char Char[]= str.toCharArray();
	System.out.print("[");
	for(int i=Char.length-1; i>=0; i--) {
		System.out.print(Char[i]);
	}
	System.out.print("]");
}
	
}
