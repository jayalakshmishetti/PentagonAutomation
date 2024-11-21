package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		//driver.findElement(By.cssSelector("img[title='Coffee Table Sets online']")).click();
		//driver.findElement(By.cssSelector("img[alt='Wooden Study Table Furniture']")).click();
		driver.findElement(By.cssSelector("img[alt='Home Decor Items ']")).click();
	}

}
