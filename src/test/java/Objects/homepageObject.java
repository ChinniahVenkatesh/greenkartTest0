package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageObject {
	
	public ChromeDriver driver;
	
	public homepageObject(ChromeDriver driver)
	{
		//PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	/*@FindBy(xpath="//input[@type='search']")
	WebElement search;
	
	public WebElement search()
	{
		return search;
	}*/
	
			By search = By.xpath("//input[@type='search']");
			
			public WebElement searchBox()
			{
			return driver.findElement(search);
			}
}
