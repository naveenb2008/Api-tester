package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
;
public class TutorialPoint {
	static WebDriver driver;
	private static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");


	}

	private static void loginpage() {
		driver.findElement(By.xpath("//a[@class='accent-nav__login-button']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//i[@class='fa fa-eye-slash']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();

	}

	private static void formfillup()  {
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("naveen");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("prabu");
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		driver.findElement(By.xpath("(//input[@name='exp'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("29.01.2024");
		driver.findElement(By.xpath("(//input[@name='profession'])[1]")).click();
		//driver.findElement(By.xpath("//input[@name='photo']")).click();
		//
		//
		driver.findElement(By.xpath("(//input[@name='tool'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='tool'])[2]")).click();
		driver.findElement(By.xpath("//select[@name='continents']")).click();
		

		driver.findElement(By.xpath("//button[@name='submit']")).click();






	}
	public static void main(String[] args)  {
		browserlaunch();
		//	loginpage();
		formfillup();
	}

}
