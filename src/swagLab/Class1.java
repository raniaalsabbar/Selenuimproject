package swagLab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	WebDriver driver = new ChromeDriver();
	
	String url="https://www.saucedemo.com/v1/index.html";
	String userName="standard_user";
	String password="secret_sauce";
	
	
	@BeforeTest
	
	public void setup() {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	
	@Test()
	public void login() {
		
		WebElement userNameInput= driver.findElement(By.id("user-name"));
		WebElement passwordInput=driver.findElement(By.id("password"));
		WebElement loginButton=driver.findElement(By.id("login-button"));
		
		userNameInput.sendKeys(userName);
		passwordInput.sendKeys(password);
		
		loginButton.click();
		
		
		List<WebElement> AddtoCart=driver.findElements(By.className("btn_primary"));
		
		
		List<WebElement>ProdectName=driver.findElements(By.className("inventory_item_name"));
		for(int i=0;i<ProdectName.size();i++)
		{
			String ProdectNames= ProdectName.get(i).getText();
			

			if(ProdectNames.contains("Backpack")||(ProdectNames.contains("Light")||(ProdectNames.contains("Onesie") )))
			{
				AddtoCart.get(i).click();
				
			}
		}
		
		
	}
	
	
	@AfterTest
	public void postmytest() {
		
	}


	

}
