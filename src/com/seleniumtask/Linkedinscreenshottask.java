package com.seleniumtask;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Linkedinscreenshottask {

	static WebDriver driver;
	//static TakesScreenshot t;
	
	
	private static void browesrLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://in.linkedin.com/");

	}
	private static void loginpage() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='session_key']")).sendKeys("naveenprabu");
       driver.findElement(By.xpath("//input[@name='session_password']")).sendKeys("naveen");
       driver.findElement(By.xpath(" //button[contains(text(),'Sign in')]")).click();
       Thread.sleep(5000);

	}
	private static void screenshot() throws IOException {
 
		TakesScreenshot t= (TakesScreenshot)driver;
 
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
 
		File to = new  File("C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\screenshot\\linkedin.png");
 
		FileHandler.copy(screenshotAs, to);
 
	}
	 public static void main(String[] args) throws InterruptedException, IOException {
		 browesrLaunch();
		 loginpage();
		screenshot();
		
	}

}
