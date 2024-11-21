package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.udemy.com/");
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		Thread.sleep(10000);
		TakesScreenshot ts = (TakesScreenshot) driver;  //for full screenshot
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("./ErrorShots/bookmyshow1.png");
		Thread.sleep(10000);
		FileHandler.copy(temp, f);
		
		Thread.sleep(10000);
		driver.quit();
	}

}
