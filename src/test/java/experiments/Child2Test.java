package experiments;
import org.testng.annotations.*;


public class Child2Test {


	

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Running before suite Test2 ");
	        // Add your setup operations here
	    }
	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Running before test Test2");
	    }

	   
	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Running before class Test2 ");
	        // Add your setup operations here
	    }

	   

	   @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Running before method Test 2");
	        // Add your setup operations here
	    }

	   

	    @Test(priority = 1)
	    public void parent2() {
	    	Parent2 p2= new Parent2();
	    	p2.P21();
	    	p2.P22();
	    	p2.P23();   
	    }

	    @Test(priority = 2)
	    public void child2() {
	    	Child2 c2 = new Child2();
	    	c2.c21();
	    	c2.C22();
	    	c2.C23();
	       
	    }
	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("Running after method Test 2");
	        // Add your cleanup operations here
	    }
	    @AfterClass
	    public void afterClass() {
	        System.out.println("Running after class Test 2");
	        // Add your cleanup operations here
	    }
	    @AfterTest
	    public void afterTest() {
	        System.out.println("Running after test Test 2");
	    }
	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("Running after suite Test 2");
	        // Add your cleanup operations here
	    }

	}


