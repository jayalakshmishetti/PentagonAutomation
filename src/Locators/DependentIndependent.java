package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("Apple");
		//driver.findElement(By.xpath("(//button[text()='ADD'])[1]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//button[text()='ADD'])[2]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Apple - Shimla']/../../..//button[text()='ADD']")).click();
	}

}
