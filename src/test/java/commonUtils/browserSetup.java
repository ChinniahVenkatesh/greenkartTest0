package commonUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class browserSetup {
	
	public ChromeDriver driver;
	public Properties prop;
	public FileInputStream fis;
	
	
	public ChromeDriver chromeBrowser()
	{
		driver = new ChromeDriver();
		return driver;
	}
	
	public String propertiesFile(String path,String key) throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream(path);
		prop.load(fis);
		return prop.getProperty(key);
	}

}
