package com.test.seleniumTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
//import java.util.concurrent.TimeUnit;//import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;


public class mainTestClass {
public static final String USERNAME = "gageguzman_ZaV8mo";
public static final String AUTOMATE_KEY = "vpJhwMFZX3XKUPseGmWu";
public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
//public static void main(String[] args) throws Exception {
//
//}
	public void initTests() {
		  Thread object1 = new Thread(new big_sur_chrome());
		  object1.start();
		  Thread object2 = new Thread(new big_sur_edge());
		  object2.start();
		  Thread object3 = new Thread(new windows_10_firefox());
		  object3.start();
		  Thread object4 = new Thread(new windows_10_ie());
		  object4.start();
		  Thread object5 = new Thread(new Iphone11Test());
		  object5.start();
	}
	public void executeTest1(Hashtable<String, String> capsHashtable) {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();
			// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
		   key = itr.next();
		   caps.setCapability(key, capsHashtable.get(key));
		}
		WebDriver driver;
		try {
	        driver = new RemoteWebDriver(new URL(URL), caps);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
	    // Searching for 'BrowserStack' on google.com
			driver.get("https://www.google.com");
			WebElement element = driver.findElement(By.name("q"));
			element.sendKeys("BrowserStack");
			element.submit();
			// Setting the status of test as 'passed' or 'failed' based on the condition; if title of the web page contains 'BrowserStack'
			WebDriverWait wait = new WebDriverWait(driver, 5);
	    try {
	    	wait.until(ExpectedConditions.titleContains("BrowserStack"));
	    	jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
	    	markTestStatus("passed","Success: title contains BrowserStack",driver);
	    }
	    catch(Exception e) {
	    	jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
	    	markTestStatus("failed","Failed: title does not contain BrowserStack",driver);

	    }
	    System.out.println(driver.getTitle());
	    driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}


	public void executeTest2(Hashtable<String, String> capsHashtable) {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();
			// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
		   key = itr.next();
		   caps.setCapability(key, capsHashtable.get(key));
		}
		WebDriver driver;
		try {
	        driver = new RemoteWebDriver(new URL(URL), caps);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
	    // Searching for 'BrowserStack' on google.com
			driver.get("https://www.browserstack.com/");
			driver.findElement(By.id("signupModalButton")).click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
		    try {
//		    	wait.until(ExpectedConditions.titleContains("BrowserStack"));
		    	wait.until(ExpectedConditions.urlContains("https://www.browserstack.com/users/sign_up"));
				System.out.println(driver.getCurrentUrl());
		    	markTestStatus("passed","Success: get started button initiates sign_up page",driver);
		    }
		    catch(Exception e) {
		    	markTestStatus("failed","Failed: get started button does not initiate sign_up page",driver);
		    }
			// Setting the status of test as 'passed' or 'failed' based on the condition; if title of the web page contains 'BrowserStack'
	    System.out.println(driver.getTitle());
	    driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public void executeTest3(Hashtable<String, String> capsHashtable) {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();
			// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
		   key = itr.next();
		   caps.setCapability(key, capsHashtable.get(key));
		}
		WebDriver driver;
		try {
	        driver = new RemoteWebDriver(new URL(URL), caps);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
	    // Searching for 'BrowserStack' on google.com
		    driver.get("https://www.browserstack.com/users/sign_in");
			driver.findElement(By.id("user_email_login")).sendKeys("gage.guzman@galvanize.com");
			driver.findElement(By.id("user_password")).sendKeys("password");
			driver.findElement(By.id("user_submit")).click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
		    try {
//		    	wait.until(ExpectedConditions.titleContains("BrowserStack"));
		    	wait.until(ExpectedConditions.urlContains("automate.browserstack.com"));
				System.out.println(driver.getCurrentUrl());
		    	markTestStatus("passed","Yaay browserStack login was successfull",driver);
		    }
		    catch(Exception e) {
		    	markTestStatus("failed","Naay browserStack login was not successfull",driver);
		    }
			// Setting the status of test as 'passed' or 'failed' based on the condition; if title of the web page contains 'BrowserStack'
	    System.out.println(driver.getTitle());
	    driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static void markTestStatus(String status, String reason, WebDriver driver) {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
	}
}