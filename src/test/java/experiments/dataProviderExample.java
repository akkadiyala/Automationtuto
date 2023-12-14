package experiments;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExample{
		@DataProvider(name="test-data")
		public Object[][] dataMethod(){
		return new Object[][]{{"anil"},{"kumar"},{"chowdary"}};
		}
		@Test(dataProvider="test-data" , invocationCount =3)
		public void test1(String value){
		System.out.println(value);
		}
		}


