package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadylinkLogin {
 static WebDriver driver;
 private static void browserlaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://user.readylink.in/customer_portal");
		driver.getCurrentUrl();

}
 private static void login_url() {
WebElement username = driver.findElement(By.name("username"));
username.sendKeys("naveen");
WebElement findElement = driver.findElement(By.id("password"));
findElement.sendKeys("qwerwert");
WebElement findElement2 = driver.findElement(By.name("password"));
findElement2.click();


}
 public static void main(String[] args) {
	 browserlaunch();
	 login_url();
}

}
