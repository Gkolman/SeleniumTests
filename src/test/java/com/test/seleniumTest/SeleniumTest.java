package com.test.seleniumTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

//package browserStackTakeHome;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	 public static final String AUTOMATE_USERNAME = "gageguzman_ZaV8mo";
	 public static final String AUTOMATE_ACCESS_KEY = "vpJhwMFZX3XKUPseGmWu";
	 public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	 
	 @Test
	public void test() throws Exception { 
		 DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", "Catalina");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "latest");
		    caps.setCapability("os", "OS X");
		    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.get("https://www.google.com");
		    WebElement element = driver.findElement(By.name("q"));
		    element.sendKeys("BrowserStack");
		    element.submit();
		    // Setting the status of test as 'passed' or 'failed' based on the condition; if title of the web page contains 'BrowserStack'
		    WebDriverWait wait = new WebDriverWait(driver, 5);
		    try {
		    	wait.until(ExpectedConditions.titleContains("BrowserStack"));
		    	markTestStatus("passed","Yaay title contains 'BrowserStack'!",driver);
		    }
		    catch(Exception e) {
		    	markTestStatus("failed","Naay title does not contain 'BrowserStack'!",driver);
		    }
		    System.out.println(driver.getTitle());
		    driver.quit();
	 }

// This method accepts the status, reason and WebDriver instance and marks the test on BrowserStack
	public static void markTestStatus(String status, String reason, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
	}
}
//	WebDriver driver;
//	@BeforeClass
//	public void testSetup()
//	{
//	System.setProperty("webdriver.chrome.driver", "/users/roberto/documents/chromedriver");
//	driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//	}
//
//	@BeforeMethod
//	public void openBrowser()
//	{
//	driver.get("https://www.browserstack.com/");
//	driver.findElement(By.id("signupModalButton")).click();
//	System.out.println("We are currently on the following URL" + driver.getCurrentUrl());
//	}
//
//	@Test(description="This method validates the sign up functionality")
//	public void signUp()
//	{
//	driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
//	driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh9049+1@gmail.com");
//	driver.findElement(By.id("user_password")).sendKeys("BrowserStack123*");
//	driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
//	driver.findElement(By.id("user_submit")).click();
//	}
//	
//	@Test
//	public void test2()
//	{
//		Assert.assertEquals(1, 2, "numbers don't add up");
//	}
//
//	public void test3()
//	{
//		Assert.assertEquals(driver.getCurrentUrl(), "https://www.browserstack.com/users/sign_up", "browser did not load ");
//	}
//	
//	@AfterMethod
//	public void postSignUp()
//	{
//	short one = 1;
//	short two = 2;
//	
//	System.out.println(driver.getCurrentUrl());
//
//	}
//	@AfterClass
//	public void afterClass()
//	{
//	driver.quit();
//	}
//}