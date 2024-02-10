package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Kotaklogin {
 static	WebDriver driver;
private static void browserlaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://netbanking.kotak.com/knb2/");

} 
private static void login_url() {
WebElement username = driver.findElement(By.id("userName"));
username.sendKeys("12347654");
WebElement captcha = driver.findElement(By.className("pristine"));//
captcha.sendKeys("sdghpkoh");
WebElement button = driver.findElement(By.className("btnVertualsubmit"));
button.click();
}
public static void main(String[] args) {
	browserlaunch();
	login_url();
	
}
}
