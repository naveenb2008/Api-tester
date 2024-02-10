package com.seleniumtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsinfacebook {
	 
	static WebDriver driver;
	 static Actions a;
	 static  Robot r;
	 static  TakesScreenshot t;
	
 private  static void browser_launch() throws InterruptedException {
   
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
 
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();

			 Thread.sleep(4000);
			 
}
 private static void robotclassfunction() throws AWTException, InterruptedException, IOException {
	 
WebElement password = driver.findElement(By.xpath("//input[@type='text']"));	 
	  a =new Actions(driver);
     // a.moveToElement(password).build().perform();
	  a.contextClick(password).build().perform();
	 r= new Robot();
   // Thread.sleep(3000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(4000);
t= (TakesScreenshot)driver;
File screenshotAs = t.getScreenshotAs(OutputType.FILE);
File path = new File("C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\screenshot\\robotclass.png");
	org.openqa.selenium.io.FileHandler.copy(screenshotAs, path);	 
		 
}
 public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	 browser_launch();
	 robotclassfunction();
}
 
}
