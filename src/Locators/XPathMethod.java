package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/login");
		//Thread.sleep(2000);
		//X-path by attributes & X-path by multiple attributes
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		
		
		//X-path by text function
		//driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		//driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		
		//X-path by contains function
		//String text = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		//System.out.println(text);
		
		//Siblings
		driver.get("file:///C:/JLMS/HTML-CSS/CSS_Class/html_testing.html");
		String text1 = driver.findElement(By.xpath("//td[text()='Bagheera']/following-sibling::td")).getText();
		String text2 = driver.findElement(By.xpath("//td[text()='Bagheera']/following-sibling::td[2]")).getText();
		String text3 = driver.findElement(By.xpath("//td[text()='Bagheera']/preceding-sibling::td")).getText();
		System.out.println("following-sibling::td "+text1);
		System.out.println("following-sibling::td[2] "+text2);
		System.out.println("preceding-sibling::td "+text3);
	}
}
