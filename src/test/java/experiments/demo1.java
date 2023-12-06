package experiments;

public class demo1 {
  demo1() {
	 System.out.println("demo1 constroctor");
 }
 String demo1() {
		 System.out.println("demo1 method");
		 return "";
	 }
 public static void main(String[] args) {
	 demo1 demo = new demo1();
	 demo.demo1();
}
}
