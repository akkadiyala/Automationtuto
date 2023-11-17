package interfacefull;

public interface laptop {
	
public void copy();
public void paste();
public void cut();
public void keyword();
default void display() {
System.out.println("please implements laptop");
}
static void audio() {
	System.out.println("laptop audio");
}
private void common() {
	System.out.println("for all methods");
}
}
