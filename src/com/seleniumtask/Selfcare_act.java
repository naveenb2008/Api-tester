package com.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfcare_act {
	static WebDriver driver;
	
	private static void browserLaunch() {
driver= new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver.get("https://digitalselfcare.actcorp.in/");
	}
public static void main(String[] args) {
	browserLaunch();
}
}
