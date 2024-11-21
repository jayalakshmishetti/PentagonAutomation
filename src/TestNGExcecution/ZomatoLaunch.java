package TestNGExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ZomatoLaunch {
	@Test (groups = "Smoke")
	public void Zomato() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Reporter.log("Zomato is launched",true);
		driver.quit();
	}
}
