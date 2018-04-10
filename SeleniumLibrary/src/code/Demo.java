package code;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import library.common;

public class Demo {
	
	//public static WebDriver driver;
	
	@Test
	public void TestFirefox()
	{
		//WebDriver driver;
		common.FirefoxInvoke("https://www.google.co.in/");
		common.driver.findElement(By.xpath("//input[@id='gs_htif0']")).sendKeys("Happy New Year Wishes");
	
	}
	
	

}
