package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.findElement(By.linkText("Register")).click();
		/*
		 * driver.findElement(By.linkText("Books\r\n" + "")).click();
		 */
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
	}
}
