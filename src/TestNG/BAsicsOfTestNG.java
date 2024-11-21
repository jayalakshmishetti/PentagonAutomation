package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BAsicsOfTestNG {
	@Test 
	public void Zomato() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Reporter.log("Zomato is launched",true);
		driver.quit();
	}
	
	@Test
	public void Dominos() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/");
		Reporter.log("Dominos is launched",true);
		driver.quit();
	}
	
	@Test
	public void Swiggy() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("Swiggy is launched",true);
		driver.quit();
	}
	
	@Test
	public void Olafoods() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://blog.olacabs.com/ola-foods-reimagining-your-favourite-gastronomic-delights/");
		Reporter.log("Ola Foods is launched",true);
		driver.quit();
	}
}
