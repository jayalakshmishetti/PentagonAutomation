package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.partialLinkText("Kids")).click();
		//String expected = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		String expected = "Kids Clothing - Buy Kids Clothes, Dresses & Bottom wear Online in India";
		Assert.assertEquals(expected, driver.getTitle(),"The driver control is not properly launched in kids page");
		driver.quit();
	}

}
