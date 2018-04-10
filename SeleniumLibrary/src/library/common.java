package library;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class common {
	
	public static WebDriver driver;
	
	public static void FirefoxInvoke(String getURL)
	{
		
		System.setProperty("webdriver.gecko.driver", "F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get(getURL);
		
	}
	
}
