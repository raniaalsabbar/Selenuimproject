package swagLab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
	
	
    static WebDriver driver = new ChromeDriver();
	
	String url="https://www.saucedemo.com/v1/index.html";
	static String userName="standard_user";
	static String password="secret_sauce";
	
	
	static void login()
	{
		WebElement userNameInput= driver.findElement(By.id("user-name"));
	WebElement passwordInput=driver.findElement(By.id("password"));
	WebElement loginButton=driver.findElement(By.id("login-button"));
	
	userNameInput.sendKeys(userName);
	passwordInput.sendKeys(password);
	
	loginButton.click();
	}
	
	
	
	static void AddtoCart()
	{
	
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

}
