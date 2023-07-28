package TestScript;


import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonUtils.browserSetup;

public class homepage {
	
	public static ChromeDriver driver;
	public String filepath = "C:\\Users\\chinn\\week_batch_may\\Web\\src\\test\\java\\TestData\\urldata.properties";

	
	@Test(priority = 1, groups = "smoke")
	public void test1() throws IOException
	{
		browserSetup bs = new browserSetup();
		driver = bs.chromeBrowser();
		String Espncricinfourl = bs.propertiesFile(filepath,"espncricinfo");
		driver.get(Espncricinfourl);
		
	}
	
	@Test(priority = 2,groups = "smoke")
	public void test2() throws IOException
	{
		browserSetup bs = new browserSetup();
		String greenkart = bs.propertiesFile(filepath,"greenkart");
		driver.get(greenkart);
	}
	
	@Test(priority = 3)
	public void titleCheck() throws IOException
	{
		String title = driver.getTitle();
		browserSetup bs = new browserSetup();
		String greenkartTitle = bs.propertiesFile(filepath,"title");
		Assert.assertEquals(greenkartTitle, title);
	}
	
	@Test(priority = 4)
	public void excelTest() throws IOException
	{
		String path = "C:\\Users\\chinn\\OneDrive\\Desktop\\test.xlsx";
		
		XSSFWorkbook xssf = new XSSFWorkbook(path);
		XSSFSheet sheet = xssf.getSheetAt(0);
		String sheetName = sheet.getSheetName();
		System.out.println(sheetName);
		System.out.println(sheet.getRow(0).getCell(1));
	}
}
