package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		
		WebElement element = driver.findElement(By.linkText("Log in"));
		
		System.out.println("Attribute: "+element.getAttribute("class"));
		System.out.println("Location: "+element.getLocation());
		System.out.println("TagName: "+element.getTagName());
		System.out.println("Text: "+element.getText());
		System.out.println("CSSValues: "+element.getCssValue("background-color"));
		System.out.println("Size: "+element.getSize());
		
		driver.quit();
	}

}
