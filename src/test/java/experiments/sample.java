package experiments;

public class sample {
	static String name="chowdary" ;
	public void method(String name) {
		this.name=name;
		System.out.println(name);
	}
	public void method1() {
		String name = "kadiyala";
		System.out.println(name);
		
		
	}
	public static void main(String[] args) {
		sample obj = new sample();
		 System.out.println("static name : "+ sample.name);
		obj.method("anil");
	
		obj.method1();
		
		System.out.println("name after update : "+sample.name);
	}

}
