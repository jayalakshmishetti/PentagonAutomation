package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		//converting for comparison
		Rectangle email_txt_fld = email.getRect();
		Rectangle pwd_txt_fld = pwd.getRect();
		//printing the x-value
		System.out.println("Email text field X-co-ordinates: "+email_txt_fld.getX());
		System.out.println("Passwaord text field X-co-ordinates: "+pwd_txt_fld.getX());
		//comparing
		if(email_txt_fld == pwd_txt_fld) {
			System.out.println("X-coordinates of both text fields are same");
		}
		else
		{
			System.out.println("X-coordinates of both text fields are not same");
		}
	}

}
