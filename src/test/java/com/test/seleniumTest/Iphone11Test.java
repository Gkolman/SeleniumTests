package com.test.seleniumTest;

import org.testng.annotations.Test;
import java.util.Hashtable;

import org.testng.annotations.Test;

public class Iphone11Test  implements Runnable {
	mainTestClass r1;
	@Test
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();

		capsHashtable.put("browserName", "iPhone");
	    capsHashtable.put("device", "iPhone 11");
	    capsHashtable.put("realMobile", "true");
	    capsHashtable.put("os_version", "14");
	    capsHashtable.put("name", "BStack-[Java] Sample Test"); // test name
	    capsHashtable.put("build", "BStack Build Number 1"); // CI/CD job or build name
		r1 = new mainTestClass();
		r1.executeTest1(capsHashtable);
  }
	@Test
	public void run1() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browserName", "iPhone");
	    capsHashtable.put("device", "iPhone 11");
	    capsHashtable.put("realMobile", "true");
	    capsHashtable.put("os_version", "14");
	    capsHashtable.put("name", "BStack-[Java] Sample Test"); // test name
	    capsHashtable.put("build", "BStack Build Number 1"); // CI/CD job or build name
		r1 = new mainTestClass();
		r1.executeTest2(capsHashtable);

	}
	@Test
	public void run2() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browserName", "iPhone");
	    capsHashtable.put("device", "iPhone 11");
	    capsHashtable.put("realMobile", "true");
	    capsHashtable.put("os_version", "14");
	    capsHashtable.put("name", "BStack-[Java] Sample Test"); // test name
	    capsHashtable.put("build", "BStack Build Number 1"); // CI/CD job or build name
		r1 = new mainTestClass();
		r1.executeTest3(capsHashtable);
	}
}
