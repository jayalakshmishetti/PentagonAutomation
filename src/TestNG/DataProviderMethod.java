package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {
	@Test (dataProvider = "fb")
	public void sendData(String email, String pswd) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emails = driver.findElement(By.name("email"));
		WebElement pwd = driver.findElement(By.name("pass"));
		emails.sendKeys(email);
		pwd.sendKeys(pswd);
		driver.quit();
	}
	
	@DataProvider(name="fb")
	public String[][] credentials (){
		String[][] data={
			{"Jaya@demo.com","Jaya@123"},
			{"Poornima@demo.com","Poorn@123"},
			{"Rithika@demo.com","Rithi@123"},
			{"Lavanya@demo.com","Lav@123"}
		};
		return data;
	}
}
