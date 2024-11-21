package TestNGExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OlafoodsLaunch {
	@Test (groups = "System")
	public void Olafoods() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://blog.olacabs.com/ola-foods-reimagining-your-favourite-gastronomic-delights/");
		Reporter.log("Ola Foods is launched",true);
		driver.quit();
	}
}
