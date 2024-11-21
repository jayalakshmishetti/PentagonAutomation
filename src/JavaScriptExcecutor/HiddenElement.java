package JavaScriptExcecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/register");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement hidden = driver.findElement(By.id("custom_gender"));
		js.executeScript("arguments[0].value='Anything';", hidden);
		Thread.sleep(2000);
		driver.quit();
	}

}
