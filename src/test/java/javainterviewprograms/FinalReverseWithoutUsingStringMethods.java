package javainterviewprograms;

public class FinalReverseWithoutUsingStringMethods {
public static void main(String[] args) {
	String str = "automation";
	StringBuilder builder = new StringBuilder();
	builder.append(str);
	StringBuilder reverse = builder.reverse();
	System.out.println(reverse);
	
	}
}
