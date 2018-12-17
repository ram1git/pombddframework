package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import listeners.Driverlistener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class TestBase {
	
	public static WebDriver dr;
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public String path="log4j.properties";
	public String path1="/or.properties";
	public static final Logger log=Logger.getLogger(TestBase.class.getName());
	public String url;
	public String browser="chrome";
	public Driverlistener list;
	public EventFiringWebDriver evd;
	
	
	public TestBase(){
	PropertyConfigurator.configure(path);	
	//log.info(TestBase.class.getName()+"TestBase constructor is getting executed");	
	prop=new Properties();
	try {
		fis=new FileInputStream(System.getProperty("user.dir")+path1);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
@Test
	public void init(){
		
	if(browser=="firefox")	{
		System.out.println(prop.getProperty("browser"));
		list=new Driverlistener();
		dr=new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		evd=new EventFiringWebDriver(dr);
		evd.register(list);
		dr=evd;
		dr.get(prop.getProperty("url"));
		
	} else{
		if(browser=="chrome")	{
			System.out.println(prop.getProperty("browser"));
			list=new Driverlistener();
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver1.exe");
			dr=new ChromeDriver();
			dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			dr.manage().window().maximize();
			evd=new EventFiringWebDriver(dr);
			evd.register(list);
			dr=evd;
			dr.get(prop.getProperty("url"));
			dr.findElement(By.xpath(prop.getProperty("close"))).click();
		System.out.println("printing");
		
	}
		
		
	  	
		
	}
		
		
	
		
	}
	
}

