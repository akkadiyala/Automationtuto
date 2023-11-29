package experiments;

public class static_and_local_variables {

	static String staticname1 = "anil static ";
	
	  String nonstaticname1 = "anil non static ";
	 static String staticname;
	 String nonstaticname;
	
	 public static void method1() {
		 String staticname1= " method1 anil static ";
		 String staticname= staticname1;
		String  nonstaticname = staticname1;
	//System.out.println(nonstaticname1); // Cannot make a static reference to the non-static field nonstaticname1 
	//here the method is static so we are not able to acces the nonstatic varible here
		System.out.println("merthod 1 staticname1 "+ staticname1);
		System.out.println("merthod 1 staticname "+ staticname);
		System.out.println("merthod 1 nonstaticname "+ nonstaticname);
	
		
	 }
	 public static void method1(static_and_local_variables nonstaticaccess) {
		 String staticname1= " method1 anil static ";
		 String staticname= staticname1;
		String  nonstaticname = staticname1;
		String nonstaticinstatic = nonstaticaccess.nonstaticname1;
	System.out.println(nonstaticinstatic); // here im asking nonstatic in static method by using classname as paramether then only i fcan acces that
		System.out.println("merthod 1 staticname1 "+ staticname1);
		System.out.println("merthod 1 staticname "+ staticname);
		System.out.println("merthod 1 nonstaticname "+ nonstaticname);
	
		
	 }

	 public  void method2() {
		 String staticname1= " method1 anil static ";
		 String staticname= staticname1;
		String  nonstaticname = staticname1;
	System.out.println(nonstaticname1);
	
		System.out.println("merthod 1 staticname1 "+ staticname1);
		System.out.println("merthod 1 staticname "+ staticname);
		System.out.println("merthod 1 nonstaticname "+ nonstaticname);
	
		
	 }
	 public static void main(String[] args) {
		 static_and_local_variables.staticname1=staticname1;
		 System.out.println( static_and_local_variables.staticname1);
		 static_and_local_variables.staticname1="anil static method 1 ";
		 System.out.println( static_and_local_variables.staticname1);
		  static_and_local_variables obj1 = new static_and_local_variables();
		 // obj1.nonstaticname1 = nonstaticname1; // Cannot make a static reference to the non-static field nonstaticname1
		  obj1.method1();
		  obj1.method2();
		  static_and_local_variables.method1(obj1);
	}
}
