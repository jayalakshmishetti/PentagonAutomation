package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='Log in']")).click(); //it will give exception: Exception in thread "main" org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <div class="x9f619
		//driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.findElement(By.xpath("//div[text()='Log in']")).submit();
	}

}
