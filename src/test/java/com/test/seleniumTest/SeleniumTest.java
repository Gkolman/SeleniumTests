package com.test.seleniumTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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
import java.net.URL;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	WebDriver driver;
	@BeforeClass
	public void testSetup()
	{
	System.setProperty("webdriver.chrome.driver", "/users/roberto/documents/chromedriver");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}

	@BeforeMethod
	public void openBrowser()
	{
	driver.get("https://www.browserstack.com/");
	driver.findElement(By.id("signupModalButton")).click();
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	}

	@Test(description="This method validates the sign up functionality")
	public void signUp()
	{
	driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh9049+1@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("BrowserStack123*");
	driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
	driver.findElement(By.id("user_submit")).click();
	}

	@AfterMethod
	public void postSignUp()
	{
	System.out.println(driver.getCurrentUrl());

	}
	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}
}