package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.close();
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		driver.quit();
	}

}	
