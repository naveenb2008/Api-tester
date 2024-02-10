package com.ipt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasktochooseproduct {
	 public static WebDriver driver;
	
	private static void browserLaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://www.flipkart.com/");
	}
	private static void searchproduct() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone' )])[2]")).click();
	}
public static void main(String[] args) {
	browserLaunch();
	searchproduct();
}
}
