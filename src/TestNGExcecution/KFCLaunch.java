package TestNGExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KFCLaunch {
	@Test (groups = "Functional")
	public void KFC() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		Reporter.log("KFC is launched",true);
		driver.quit();
	}
}
