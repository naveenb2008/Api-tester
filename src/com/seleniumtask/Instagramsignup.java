package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramsignup {
	
	static WebDriver driver;
private static void browser() {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
 driver =new ChromeDriver();
 driver.get("https://www.instagram.com/accounts/login/");
// WebElement findElement = driver.findElement(By.xpath("//span[text()='Sign up']"));
 //findElement.click();
}
private static void createaccount() {
//driver.findElement(By.xpath("//span[text()='Sign up']")).click();

}
//private static void detailfilling() {
//driver.findElement(By.xpath("//span[text()='Mobile Number or Email']")).sendKeys("8765434567");
//driver.findElement(By.xpath("//span[text()='Full Name']")).sendKeys("naveen");
//driver.findElement(By.xpath("//span[text()='Username']")).sendKeys("@naveenB6");
//driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("@$#4677435");
//driver.findElement(By.xpath("//button[text()='Sign up']")).click();
//}
public static void main(String[] args) {
	browser();
	//createaccount();
	//detailfilling();
}
}
