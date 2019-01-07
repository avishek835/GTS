package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import config.Configuration;
import mainPackageSingleton.MainPackage;


public class Base {
	
	ExtentReports rep=MainPackage.getInstance();
	protected ExtentTest test;
	protected WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		
		//test=rep.startTest("Project GTS Testing");
		
		MainPackage.Initialize();
		MainPackage.Instance.navigate().to(Configuration.url.app_url);
		
	}
	
	/*@AfterClass
	public void cleanup()
	{
		SingleTon.close();
	}*/

}
