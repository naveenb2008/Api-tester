package com.seleniumtask;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookerrorscreenshot {
static WebDriver driver;
static TakesScreenshot t;
private static void browserlaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver = new ChromeDriver();


driver.get("https://www.facebook.com/login/");

}
private static void loginpage() {
	
	
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arun");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");

driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

}
 private static void screenshot() throws IOException, InterruptedException {
	 
	 Thread.sleep(3000);
	 
t= (TakesScreenshot)driver;
File screenshot = t.getScreenshotAs(OutputType.FILE);
File path = new File("C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\screenshot\\error.png");
org.openqa.selenium.io.FileHandler.copy(screenshot, path);

}
 public static void main(String[] args) throws IOException, InterruptedException {
	 browserlaunch();
	 loginpage();
	 screenshot();
	 
}

}
