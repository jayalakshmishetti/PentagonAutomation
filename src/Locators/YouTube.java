package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.youtube.com/");
				//Thread.sleep(2000);				
				//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("tom and jerry");
				driver.findElement(By.name("search_query")).sendKeys("tom and jerry");
				//driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
				driver.findElement(By.id("search-icon-legacy")).click();
				//driver.get("https://www.youtube.com/results?search_query=tom+and+jerry");
				Thread.sleep(2000);			
				//driver.findElement(By.xpath("//a[@id='video-title' and @title='Tom & Jerry | Tom & Jerry in Full Screen | Classic Cartoon Compilation | WB Kids']")).click();
				driver.findElement(By.xpath("//yt-formatted-string[text()='Tom & Jerry | Tom & Jerry in Full Screen | Classic Cartoon Compilation | WB Kids']")).click();
				
				//driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
				
				Thread.sleep(3000);
				driver.quit();
	}

}
