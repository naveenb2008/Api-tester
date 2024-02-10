package com.seleniumtask;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.thread.TryExecutor;

public class CowinTask {
	
  static WebDriver driver;
  static TakesScreenshot t;
  static JavascriptExecutor js;
  static Select s ,s1;
  

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.get("https://www.demo.co-vin.in/");
		driver.manage().window().maximize();
		

	}
	
	private static void scrolldown() {
			js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");

	} 
		
	
	
	private static void dropdown() throws InterruptedException {
	     Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Select Your State']")).click();
		 Thread.sleep(4000);
	    driver.findElement(By.xpath("//span[text()=' Tamil Nadu ']")).click();
	    Thread.sleep(4000);
	    
	    
	    driver.findElement(By.xpath("//span[text()='Select District']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//span[text()=' Thanjavur ']")).click();
     
	    driver.findElement(By.xpath("//button[text()='Search']")).click();
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,100)"); 
	   
	
	}
	 private static void screenshot() throws IOException {
		
		 
		 t = (TakesScreenshot)driver;
		File slotpage = t.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\screenshot\\cowin.png");
    org.openqa.selenium.io.FileHandler.copy(slotpage, path);
	}
	
	
	 public static void main(String[] args) throws IOException, InterruptedException {
		 
		browserLaunch();
		scrolldown();
		dropdown();
		screenshot();
	}
}
