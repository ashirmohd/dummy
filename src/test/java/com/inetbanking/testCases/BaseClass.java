package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	public String baseURL="https://demo.guru99.com/v3/index.php";
	public String username="mngr450959";
	public String password="pEpAtum";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"./driver/chromedriver.exe");
		driver =new ChromeDriver();
	}
	 @AfterClass
	 public void tearDown()
	 {
		 driver.quit();
	 }
}
