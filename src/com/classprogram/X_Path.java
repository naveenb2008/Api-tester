package com.classprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {

	static WebDriver driver;
	
	private static void browserLaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
 driver=new  ChromeDriver();
driver.get("https://www.facebook.com/login/");
}
	private static void loginpage() {
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}
	
	public static void main(String[] args) {
		browserLaunch();
		loginpage();
	}
}
