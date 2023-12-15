package programming;

public class Operatorandequals {
	public static void main(String[] args) {
		
	
String s1 = "abo";
StringBuffer s2 = new StringBuffer(s1);
StringBuffer s3 = new StringBuffer("abo");

System.out.println(s2);
System.out.println(s3);
System.out.println(s1.equals(s2));
System.out.println(s2.equals(s3));
System.out.println(s2==s3);

String str2 = s2.toString();
String str3= s3.toString();
System.out.println(str2.equals(s1));
System.out.println(s1.equals(s3));
System.out.println(str2==s1);
System.out.println(str3==str2);
System.out.println(str3.equals(str2));
	}
}
