package programming;

public class staticclass {
static void method() {
	System.out.println("get static method");
}
String method1(String anil) {
	
	return "anil kumar";
}

public static void main(String[] args) {
	staticclass first = null;  // even though make that class as null we get output
	staticclass.method();
	first.method();
	
String name=	first.method1("anil kumar");
System.out.println(name);  // we get nullponterexception becaise here oclass pobject is null;
}// Cannot invoke "programming.staticclass.method1(String)" because "first" is null
}
