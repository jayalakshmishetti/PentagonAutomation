package TestNGExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DominosLaunch {
	@Test (groups = "Smoke")
	public void Dominos() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/");
		Reporter.log("Dominos is launched",true);
		driver.quit();
	}
}
