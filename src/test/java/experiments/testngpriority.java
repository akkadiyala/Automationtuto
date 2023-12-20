package experiments;

import org.testng.annotations.Test;

public class testngpriority {
@Test(priority = 1)
public void a() {
	System.out.println(" test a ");
}
@Test(priority = 2)
public void d() {
	System.out.println("test d");
}
@Test(priority = 3)
public void b() {
	System.out.println(" test b ");
}
@Test(priority = 2)
public void c() {
	System.out.println(" test c ");
} 
}
