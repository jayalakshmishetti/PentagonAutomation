package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Navigation navigate = driver.navigate();
		//to go to other page
		navigate.to("https://www.facebook.com/");
		Thread.sleep(2000);
		//to go to previous page
		navigate.back();
		Thread.sleep(2000);
		//to go to next page
		navigate.forward();
		Thread.sleep(2000);
		//to refresh last opened page
		navigate.refresh();
		driver.quit();
	}
}
