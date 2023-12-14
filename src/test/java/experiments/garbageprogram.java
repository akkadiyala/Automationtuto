package experiments;

public class garbageprogram {
public static void main(String[] args) throws Exception   {
	String str = new String("automation");
	
	//making str eligible for gc
	str= null;
	//calling garbage collector 
	System.gc();
	//waiting for garbage complete
	Thread.sleep(5000);
	System.out.println("end of main");
	
}
@Override
protected void finalize() {
	System.out.println("finazlie method run");
}
}
