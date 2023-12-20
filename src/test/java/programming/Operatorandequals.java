package programming;

public class Operatorandequals {
	public static void main(String[] args) {
		
	
String s1 = "anil";
StringBuffer s2 = new StringBuffer("anil");
StringBuffer s3 = new StringBuffer("anil");
String a = "JAVA";
String b = "java";
String c= "JAVA";
System.out.println(s2);
System.out.println(s3);
System.out.println(s1.equals(s2));
System.out.println(s2.equals(s3));
System.out.println(s2==s3);

String str2 = s2.toString();
String str3= s3.toString();
System.out.println("");  //this below 4 output is exact example for == and euqals
System.out.println(str2.equals(s1));

System.out.println(str2.equals(str3)); 

System.out.println(str3==str2);
System.out.println(str2==s1);  
System.out.println("");

System.out.println(a.equals(c));  // comapre yhe values
System.err.println(b.equals(a));

System.out.println(a.equals(b));


//System.out.println(a=b);
//System.out.println(b=a);
System.out.println(a==b);
System.out.println(a==c);

	}
}
