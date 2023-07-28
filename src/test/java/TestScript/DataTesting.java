package TestScript;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataTesting {
	
	public  Logger log = LogManager.getLogger(DataTesting.class);
	
	
	@Test(dataProvider="Data_For_Testing")
	public void dataIntegration(String name)
	{
		System.out.println(name);
		log.info(name);
	}
	
	@DataProvider(name = "Data_For_Testing")
	public Object[][] dataset()
	{
		return new Object[][] {{"Arun"},{"Venkatesh"}};
	}
	
	
	@Test()
	@Parameters({"a","b"})
	public void parameterData(int a , int b)
	{
		System.out.println(a+b);
		log.info(a+b);
	}

}
