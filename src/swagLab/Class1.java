package swagLab;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 extends class2 {

	
	
	
	@BeforeTest
	
	public void setup() {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	
	@Test()
	public void myTest() {
		login();
		
		 AddtoCart();
		 
		
		
	
		
		
	}
	
	
	@AfterTest
	public void postmytest() {
		
	}


	

}
