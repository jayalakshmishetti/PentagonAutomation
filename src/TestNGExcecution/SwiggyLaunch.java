package TestNGExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SwiggyLaunch {
	@Test (groups = "Integration")
	public void Swiggy() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("Swiggy is launched",true);
		driver.quit();
	}
}
