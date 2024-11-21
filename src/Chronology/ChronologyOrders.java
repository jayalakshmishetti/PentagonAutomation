package Chronology;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologyOrders {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite is getting launched",true);
	}	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite is getting launched",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test is getting launched",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test is getting launched",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before Class is getting launched",true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("After Class is getting launched",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method is getting launched",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("After Method is getting launched",true);
	}
	
	@Test
	public void chronologyMain() {
		Reporter.log("Main is getting launched",true);
	}
}
