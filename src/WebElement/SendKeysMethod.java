package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		firstName.sendKeys("Jayalakshmi",Keys.CONTROL+"A");
		Thread.sleep(2000);
		firstName.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		lastName.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		driver.quit();
	}

}
