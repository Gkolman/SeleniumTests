package com.test.seleniumTest;

import org.testng.annotations.Test;
import java.util.Hashtable;

import org.testng.annotations.Test;

public class windows_10_ie  implements Runnable {
	mainTestClass r1;
	@Test
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("os_version", "10");
		capsHashtable.put("resolution", "1920x1080");
		capsHashtable.put("browser", "IE");
		capsHashtable.put("browser_version", "11.0");
		capsHashtable.put("os", "Windows");
		capsHashtable.put("name", "BStack-[Java] Sample Test"); // test name
		capsHashtable.put("build", "BStack Build Number 1"); // CI/CD job or build name
		r1 = new mainTestClass();
		r1.executeTest1(capsHashtable);
  }
	@Test
	public void run1() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("os_version", "10");
		capsHashtable.put("resolution", "1920x1080");
		capsHashtable.put("browser", "IE");
		capsHashtable.put("browser_version", "11.0");
		capsHashtable.put("os", "Windows");
		capsHashtable.put("name", "BStack-[Java] Sample Test"); // test name
		capsHashtable.put("build", "BStack Build Number 1"); // CI/CD job or build name
		r1 = new mainTestClass();
		r1.executeTest2(capsHashtable);

	}
	@Test
	public void run2() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("os_version", "10");
		capsHashtable.put("resolution", "1920x1080");
		capsHashtable.put("browser", "IE");
		capsHashtable.put("browser_version", "11.0");
		capsHashtable.put("os", "Windows");
		capsHashtable.put("name", "BStack-[Java] Sample Test"); // test name
		capsHashtable.put("build", "BStack Build Number 1"); // CI/CD job or build name
		r1 = new mainTestClass();
		r1.executeTest3(capsHashtable);
	}
}
