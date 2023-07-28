package TestScript;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

import Objects.homepageObject;
import commonUtils.browserSetup;

public class greenKartHomePage {
	
	public ChromeDriver driver;
	
	@BeforeClass()
	public void clearingcookies()
	{
		System.out.println("Clear cookies");
	}
	@BeforeMethod
	public void testMethod()
	{
		System.out.println("Before method");
	}
	
	@Test()
	public void searchBox()
	{
		browserSetup bs = new browserSetup();
		driver = bs.chromeBrowser();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		homepageObject ho = new homepageObject(driver);
		//ho.search().sendKeys("Tomato");
		ho.searchBox().sendKeys("Tomato");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Testing");
	}

	@AfterMethod()
	public void test()
	{
		System.out.println("Testing after the each module");
	}
	
	@BeforeTest()
	public void testing()
	{
		System.out.println("Before Test");
	}
	
	@Test()
	public void espn()
	{
		browserSetup bs = new browserSetup();
		driver = bs.chromeBrowser();
		driver.get("https://www.espn.in");
	}
	
}
