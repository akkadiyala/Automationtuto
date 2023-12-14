package experiments;

public class Stringmethods {
	public static void main(String[] args) {
		
String str = new String("Hello");
System.out.println("actual string: "+ str);

String concatstr = str.concat(" world ");
System.out.println("after concat string " +concatstr );

int value = str.charAt(3);
char position3 = str.charAt(3);

System.out.println("str number 3 position is "+ value);
System.out.println("position 3 value is "+ position3);

boolean status =str.startsWith("E");
System.out.println("start with e is "+ status);

boolean status1 =str.endsWith("o");
System.out.println("ends with e is "+ status1);

boolean status2 =str.contains("a");
System.out.println("str contains a is "+ status2);

int position =str.indexOf("l");
System.out.println("position of l in str is "+ position);

 int position1=str.lastIndexOf("l");
 System.out.println(" last position of l in str is "+ position1);
 
boolean name= str.matches("anil");
System.out.println("anil name in hello: "+name);
 
int compare=str.compareTo(concatstr);
System.out.println(compare);
 
 
 
 
 
 
}

	
}