package mainPackageSingleton;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;


import config.Configuration;

public class MainPackage {
	//static WebDriver driver;
	public static WebDriver Instance=null;
	
	private static ExtentReports extent;
	
	public static ExtentReports getInstance()
	{
		if(extent==null){
			Date d=new Date();
			String fileName=d.toString().replace(":","_").replace(" ","_")+".html";
			extent=new ExtentReports("E:\\Avishek\\Report\\"+fileName, true, DisplayOrder.NEWEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
		}
		return extent;
		
	}	
	public static void Initialize()
	{
		if(Instance==null)
		{
			System.out.println("Initialise Driver");
			if(Configuration.Browser.browser.equalsIgnoreCase("cc")) {
				System.setProperty("webdriver.chrome.driver", "E:\\Avishek\\SeleniumProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
				Instance=new ChromeDriver();}
				else if(Configuration.Browser.browser.equalsIgnoreCase("ff")) { 
					System.setProperty("webdriver.gecko.driver", "E:\\Avishek\\SeleniumProjects\\Drivers\\geckodriver.exe");
					Instance=new FirefoxDriver();}
		}
		
		
		Instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Instance.manage().window().maximize();
	}

	public static void close()
	{
		System.out.println("Closing Browser");
		Instance.close();
		Instance=null;
	}
	
	public static void back()
	{
		Instance.navigate().back();
	}
	
	public static void quit()
	{
		System.out.println("Quiting from Browser");
		Instance.quit();
		Instance=null;
	}
	
	
	public static void scrollDown()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)Instance;
		jse.executeScript("scroll(0, 2150);");
		//((Driver) Instance).scrollDown();
		
	}
	
	public static void scrollDownNews()
	{
		JavascriptExecutor jse = (JavascriptExecutor)Instance;
		jse.executeScript("scroll(0, 2450);");
	}
	
	public static void FooterAdvantages()
	{
		Instance.findElement(By.xpath(Configuration.FooterAdvantages.footerAdvantages)).click();
	}
	
	public static void WhyTreatment()
	{
		Instance.findElement(By.xpath(Configuration.WhyTreatment.whyTreatment)).click();
	}
	
	public static void process()
	{
		Instance.findElement(By.xpath(Configuration.Process.process)).click();
	}
	
	public static void WasteWaterTreatment()
	{
		Instance.findElement(By.xpath(Configuration.WasteWaterTreatment.wasteWaterTreatment)).click();
		
	}
	
	
	public static void Reuseforflushingshower()
	{
	//Instance.findElement(By.xpath("/html/body/div/header/div[1]/div/div[2]/div/img")).click();
		
		Instance.findElement(By.xpath(Configuration.Reuseforflushingshower.reuseforflushingshower)).click();
		//System.out.println("Click on hamburger menu");
	}
	
	public static void BeautificationIrrigation()
	{
		Instance.findElement(By.xpath(Configuration.BeautificationIrrigation.beautificationIrrigation)).click();
		//System.out.println("Close on hamburger menu");
	}
	
	/*public static void Welcometext()
	{
		//Instance.findElement(By.xpath(Configuration.Welcometext.welcometext)).click();
			String s=Instance.findElement(By.xpath(Configuration.Welcometext.welcometext)).getText();
			System.out.println("Got the text");
			if(s!=null) {
			System.out.println("Welcome To Project Sisi. text is present");
			
		}else
			System.out.println("Not found accurate message");
	}*/
	
	public static void EffluentPolishingRetrofitLagoon()
	{
		
		Instance.findElement(By.xpath(Configuration.EffluentPolishingRetrofitLagoon.EffluentPolishingRetrofitLagoon)).click();
		
	}
	
		
	public static void Commercial()
	{
		
		Instance.findElement(By.xpath(Configuration.Commercial.commercial)).click();
		
	}
	
	public static void Residential()
	{
		
		Instance.findElement(By.xpath(Configuration.Residential.residential)).click();
		
	}
	
	public static void CommunalSubdivision()
	{
		
		Instance.findElement(By.xpath(Configuration.CommunalSubdivision.communalSubdivision)).click();
		
	}
	
	public static void Development()
	{
		
		Instance.findElement(By.xpath(Configuration.Development.development)).click();
		
	}
	
	public static void Farms()
	{
		
		Instance.findElement(By.xpath(Configuration.Farms.farms)).click();
		
	}
	
	public static void SewerMining()
	{
		
		Instance.findElement(By.xpath(Configuration.SewerMining.sewerMining)).click();
		
	}
	
	public static void TemporaryCamps()
	{
		
		Instance.findElement(By.xpath(Configuration.TemporaryCamps.temporaryCamps)).click();
		
	}
	
	public static void AboutUs()
	{
		
		Instance.findElement(By.xpath(Configuration.AboutUs.aboutUs)).click();
		
	}
	
	public static void MediaDownlod()
	{
		
		Instance.findElement(By.xpath(Configuration.MediaDownlod.mediaDownlod)).click();
		
	}
	
	public static void ourFollowUp()
	{
		
		Instance.findElement(By.xpath(Configuration.OurFollowUp.ourFollowUp)).click();
		
	}
	
	public static void QA()
	{
		
		Instance.findElement(By.xpath(Configuration.QA.QA)).click();
		
	}
	/*
	public static void Advantages()
	{
		
		Instance.findElement(By.xpath(Configuration.Advantages.Advantages)).click();
		
	}
	
	public static void Technology()
	{
		Instance.findElement(By.xpath(Configuration.Technology.technology)).click();
	}*/
	
	
	public static void Industries() throws InterruptedException
	{
		Actions act= new Actions(Instance);
		act.moveToElement(Instance.findElement(By.xpath(Configuration.Technology.technology))).perform();
		Thread.sleep(1000);
		Instance.findElement(By.xpath(Configuration.Advantages.Advantages)).click();
		
	}
	
	
}
