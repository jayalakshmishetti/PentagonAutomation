package JavaScriptExcecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.google.co.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.name("q")).sendKeys("cars",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Images']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='The Top 10 Sports Cars In India']")).click();
				break;
			}
			catch(Exception e) {
				js.executeScript("window.scrollBy(0,500);", true);
			}
		}
	}

}