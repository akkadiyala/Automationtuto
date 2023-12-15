package experiments;
import org.testng.annotations.*;


public class Child1Test {


	

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Running before suite Test1 ");
	        // Add your setup operations here
	    }
	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Running before test 	Test1");
	    }

	   
	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Running before class Test1 ");
	        // Add your setup operations here
	    }

	   

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Running before method Test 1");
	        // Add your setup operations here
	    }

	   

	    @Test(priority = 1)
	    public void parent1() {
	    	Parent1 p1= new Parent1();
	    	p1.P1();
	    	p1.P2();
	    	p1.P3();   
	    }

	    @Test(priority = 2)
	    public void child1() {
	    	Child1 c1 = new Child1();
	    	c1.C1();
	    	c1.C2();
	    	c1.C3();
	       
	    }
	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("Running after method Test 1");
	        // Add your cleanup operations here
	    }
	    @AfterClass
	    public void afterClass() {
	        System.out.println("Running after class Test 1");
	        // Add your cleanup operations here
	    }
	    @AfterTest
	    public void afterTest() {
	        System.out.println("Running after test Test 1");
	    }
	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("Running after suite Test 1");
	        // Add your cleanup operations here
	    }

	}


