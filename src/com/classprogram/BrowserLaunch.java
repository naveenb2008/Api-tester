package com.classprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {


public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	String title = driver.getTitle();
	System.out.println(title);
	
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	Thread.sleep(4000);
	
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(4000);

	
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	driver.navigate().back();
	Thread.sleep(4000);

	driver.navigate().refresh();
	Thread.sleep(4000);

	driver.navigate().forward();
	 String currentUrl2 = driver.getCurrentUrl();
	 System.out.println(currentUrl2);
		
	
	
	
	
	
}
}
