package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BAsicsOfTestNG2 {
	@Test (priority = -1)
	public void CreateZomato() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Reporter.log("CreateZomato is launched",true);
		driver.quit();
	}
	
	//@Test (priority = -2, invocationCount = 5, enabled = false)
	@Test (priority = -2, dependsOnMethods = "DeleteSwiggy")
	public void LoginDominos() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/");
		Reporter.log("LoginDominos is launched",true);
		driver.quit();
	}
	
	@Test (priority = 3, threadPoolSize = 2)
	public void DeleteSwiggy() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("DeleteSwiggy is launched",true);
		driver.quit();
	}
	
	@Test (priority = 4)
	public void ModifyOlafoods() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://blog.olacabs.com/ola-foods-reimagining-your-favourite-gastronomic-delights/");
		Reporter.log("ModifyOlafoods is launched",true);
		driver.quit();
	}
}
